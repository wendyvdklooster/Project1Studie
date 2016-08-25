/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Excen
 */
@Entity
@Table(name = "ACCOUNTS") 
public class Account implements Serializable {
  
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    @Column (unique = true, nullable = false, name = "ACCOUNT_ID")
    private long Id;
    
    @Column(unique = true, nullable = false)
    private String username;
    
    @Column(nullable = false)  // hoe werkt het met een paswoord
    private String password;
    
    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name ="KLANT_ID")// hoe zit de relatie met klant?
    private Klant klant;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private java.util.Date creatieDatum;

    /**
     * @return the Id
     */
    public long getId() {
        return Id;
    }

    
    public void setId(long AccountId) {
        this.Id = AccountId;
    }

    /**
     * @return the username
     */
    public String getNaam() {
        return username;
    }

    /**
     * @param naam the username to set
     */
    public void setNaam(String naam) {
        this.username = naam;
    }

    /**
     * @return the creatieDatum
     */
    public java.util.Date getCreatieDatum() {
        return creatieDatum;
    }

    /**
     * @param creatieDatum the creatieDatum to set
     */
    public void setCreatieDatum(java.util.Date creatieDatum) {
        this.creatieDatum = creatieDatum;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
 
}
