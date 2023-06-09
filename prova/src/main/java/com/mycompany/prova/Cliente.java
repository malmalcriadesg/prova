/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public class Cliente {

private int protocoloAtendimento;

    public Cliente(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    @Override
    public String toString() {
        return super.toString()+
                 "protocoloAtendimento" + protocoloAtendimento + '}';
    }


    
}
