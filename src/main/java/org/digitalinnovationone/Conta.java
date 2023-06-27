package org.digitalinnovationone;

public class Conta {
    int contacorrente;
    String agencia;
    String nomeCliente;
    Double saldo;

    public Conta() {
        this.contacorrente = contacorrente;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getContacorrente() {
        return contacorrente;
    }

    public void setContacorrente(int contacorrente) {
        this.contacorrente = contacorrente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


}