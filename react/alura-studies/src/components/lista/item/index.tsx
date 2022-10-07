import { ITarefa } from '../../../types/Tarefa';
import style from '../lista.module.scss';

export default function Item({tarefa, tempo, selecionado, completado, id} : ITarefa) {
  return (
    <li className={style.item}>
      <h3>{tarefa}</h3>
      <span>{tempo}</span>
    </li>
  );
}
