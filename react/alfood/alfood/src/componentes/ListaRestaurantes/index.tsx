import IRestaurante from '../../interfaces/IRestaurante';
import style from './ListaRestaurantes.module.scss';
import Restaurante from './Restaurante';

const ListaRestaurantes = () => {

  const restaurantes: IRestaurante[] = [
    {
      id: 1,
      nome: "Lyllys Cafe",
      pratos: [
        {
          id: 1,
          descricao: "Lasanha à Bolonhesa",
          imagem:
            "https://vitarella.com.br/wp-content/uploads/2020/12/08_LASANHA_FINAL-1-min-600x535.jpg",
          nome: "Lasanha",
          restaurante: 1,
          tag: "Italiana",
        },
        {
          id: 2,
          descricao: "Strogonoff de Frango à brasileira",
          imagem:
            "https://img.itdg.com.br/images/recipes/000/002/462/332854/332854_original.jpg",
          nome: "Strogonoff",
          restaurante: 1,
          tag: "Russa",
        },
        {
          id: 3,
          descricao: "Empadão de Frango",
          imagem:
            "https://assets.delirec.com/images%2FxGovU6WRHyNYvl6FYi0ypENQkJj1%2Frecipe%2Fd26aa2e8-d113-41c6-9b39-5162551a9f33-Empad%C3%A3o-de--frango--gallery-0",
          nome: "Empadão de Frango",
          restaurante: 1,
          tag: "Portuguesa",
        },
      ],
    },
    {
      id: 2,
      nome: "Sugiro Sushi",
      pratos: [
        {
          id: 1,
          descricao: "Combinado de 8 peças",
          imagem:
            "https://www.sabornamesa.com.br/media/k2/items/cache/5031e263a4a258791d6306b2d3d9dbf6_XL.jpg",
          nome: "Sushi",
          restaurante: 1,
          tag: "Japonesa",
        },
        {
          id: 2,
          descricao: "Sashimi de Salmão",
          imagem:
            "https://www.comidaereceitas.com.br/img/sizeswp/1200x675/2009/04/sashimi_facil.jpg",
          nome: "Sashimi",
          restaurante: 1,
          tag: "Japonesa",
        },
      ],
    },
    {
      id: 3,
      nome: "Cantina da Escola",
      pratos: [
        {
          id: 1,
          descricao: "Salgado de queijo com presunto",
          imagem:
            "https://img.itdg.com.br/tdg/images/recipes/000/102/312/279767/279767_original.jpg",
          nome: "Quejunto",
          restaurante: 1,
          tag: "Lanche",
        },
        {
          id: 2,
          descricao: "Coxinha de Frango",
          imagem:
            "https://t1.rg.ltmcdn.com/pt/posts/1/9/1/coxinha_simples_191_600.jpg",
          nome: "Coxinha",
          restaurante: 1,
          tag: "Lanche",
        },
        {
          id: 3,
          descricao: "Risole de Palmito",
          imagem:
            "https://img.itdg.com.br/tdg/images/recipes/000/005/116/323871/323871_original.jpg",
          nome: "Risole",
          restaurante: 1,
          tag: "Lanche",
        },
      ],
    },
    {
      id: 4,
      nome: "Jota Lanches",
      pratos: [
        {
          id: 1,
          descricao: "Pão de forma com presunto e queijo",
          imagem:
            "https://receitinhas.com.br/wp-content/uploads/2022/09/Misto-quente-de-padaria.png",
          nome: "Misto Quente",
          restaurante: 1,
          tag: "Lanche",
        },
      ],
    },
  ];

  return (<section className={style.ListaRestaurantes}>
    <h1>Os restaurantes mais <em>bacanas</em>!</h1>
    {restaurantes?.map(item => <Restaurante restaurante={item} key={item.id} />)}
  </section>)
}

export default ListaRestaurantes