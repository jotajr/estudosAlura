import { Cliente } from "./Cliente.js";
import { ContaCorrente } from "./ContaCorrente.js";

const cliente1 = new Cliente("Ricardo", 11122233309);

const cliente2 = new Cliente("Alice", 88822233309);

const contaCorrenteRicardo = new ContaCorrente(cliente1, 1001);
contaCorrenteRicardo.depositar(500);

const contaCorrenteAlice = new ContaCorrente(cliente2, 1002);

//contaCorrenteAlice.saldo = 1000;
contaCorrenteRicardo.transferir(200, contaCorrenteAlice);

console.log(contaCorrenteRicardo);
console.log(contaCorrenteAlice);

console.log("Numero de contas: ", ContaCorrente.numeroDeContas);
