package uy.edu.ucu.APIUCU.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class State {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code;
    private char name;
    private int codeCity;
    private char zone;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public int getCodeCity() {
        return codeCity;
    }

    public void setCodeCity(int codeCity) {
        this.codeCity = codeCity;
    }

    public char getZone() {
        return zone;
    }

    public void setZone(char zone) {
        this.zone = zone;
    }

}
