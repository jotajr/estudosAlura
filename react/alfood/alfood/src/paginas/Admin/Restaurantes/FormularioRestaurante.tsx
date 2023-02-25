import { Button, TextField } from "@mui/material";
import axios from "axios";
import { useEffect, useState } from "react";
import { useParams } from "react-router";
import IRestaurante from "../../../interfaces/IRestaurante";

export default function FormularioRestaurante() {
  const parametros = useParams();

  useEffect(() => {
    if (parametros.id) {
      axios
        .get<IRestaurante>(
          `http://localhost:8000/api/v2/restaurantes/${parametros.id}/`
        )
        .then((resposta) => {
          console.log(resposta.data.nome);
          setNomeRestaurante(resposta.data.nome);
        });
    }
  }, [parametros]);

  const [nomeRestaurante, setNomeRestaurante] = useState("");

  const enviarFormulario = (evento: React.FormEvent<HTMLFormElement>) => {
    evento.preventDefault();
    //console.log("Preciso enviar os dados para a API:");
    //console.log(nomeRestaurante);

    if (parametros.id) {

        axios
          .put(`http://localhost:8000/api/v2/restaurantes/${parametros.id}/`, {
            nome: nomeRestaurante,
          })
          .then(() => {
            alert("Restaurante atualizado com sucesso");
          });

    } else {

      axios
        .post("http://localhost:8000/api/v2/restaurantes/", {
          nome: nomeRestaurante,
        })
        .then(() => {
          alert("Restaurante cadastrado com sucesso");
        });
    }
  };

  return (
    <form onSubmit={enviarFormulario}>
      <TextField
        value={nomeRestaurante}
        onChange={(evento) => setNomeRestaurante(evento.target.value)}
        id="standard-basic"
        label="Nome do Restaurante"
        variant="standard"
      />
      <Button variant="outlined" type="submit">
        Salvar
      </Button>
    </form>
  );
}
