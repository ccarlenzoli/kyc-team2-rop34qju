package com.teamdue.bankingData.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Anagrafica")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ndg;

    private Date data_inserimento;
    private Date data_ultima_modifica;
    private String email;
    private String first_name;
    private String name;
    private String ndg_type;
    private String vat_number;

    public Company() {
    }

    public String getNdg() {
        return ndg;
    }

    public void setNdg(String ndg) {
        this.ndg = ndg;
    }

    public Date getData_inserimento() {
        return data_inserimento;
    }

    public void setData_inserimento(Date data_inserimento) {
        this.data_inserimento = data_inserimento;
    }

    public Date getData_ultima_modifica() {
        return data_ultima_modifica;
    }

    public void setData_ultima_modifica(Date data_ultima_modifica) {
        this.data_ultima_modifica = data_ultima_modifica;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNdg_type() {
        return ndg_type;
    }

    public void setNdg_type(String ndg_type) {
        this.ndg_type = ndg_type;
    }

    public String getVat_number() {
        return vat_number;
    }

    public void setVat_number(String vat_number) {
        this.vat_number = vat_number;
    }
}
