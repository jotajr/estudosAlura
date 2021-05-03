export class Cliente {
  _nome;
  _cpf;

  get cpf(){
      return this._cpf;
  }

  get nome(){
      return this._nome;
  }

  constructor(nome, cpf) {
      this._nome = nome;
      this._cpf = cpf;
  }
}