package com.github.braully.dws.controle;

import com.github.braully.dws.modelo.Cliente;
import com.github.braully.dws.modelo.Estado;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.stereotype.Component;

@Component
public class ClienteControle {

    Cliente cliente ;

    public Estado[] getListaEstados(){
        return Estado.values();
    }
    public ClienteControle () {
        novoCliente();
    }

    public Cliente getCliente () {
        return cliente;
    }

    public void setCliente (Cliente cliente) {
    this.cliente = cliente;
    }

    public void novoCliente () {
    this.cliente = new Cliente ();
    }

    public void salvarCliente () {
    String mensagem = " Cliente   Salvo : " + cliente;
    System.out.println (mensagem);
    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(mensagem));
    }
}
