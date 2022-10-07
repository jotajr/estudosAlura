import React, { useState } from "react";
import Cronometro from "../components/cronometro";
import Formulario from "../components/formulario";
import Lista from "../components/lista";
import { ITarefa } from "../types/Tarefa";
import style from "./App.module.scss";

function App() {
  const [tarefas, setTarefas] = useState<ITarefa[]>([]);
  return (
    <div className={style.AppStyle}>
      <Formulario setTarefas={setTarefas}/>
      <Cronometro />
      <Lista tarefas={tarefas} />
    </div>
  );
}

export default App;
