package dominio;

import java.util.Objects;

public class Usuario {
    private String cpf;
    private String email;
    private String nome;
    private String senha;
    private String instituicao;
    private String fone;
    private String matricula;
    private String tipo;

/*    public Usuario(String cpf, String email, String nome, String senha, String instituicao, String fone, String matricula, String tipo) {
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.instituicao = instituicao;
        this.fone = fone;
        this.matricula = matricula;
        this.tipo = tipo;
    }*/


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}


	public void setFone(String fone) {
		this.fone = fone;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
    
    public String getInstituicao() {
		return instituicao;
	}

	public String getFone() {
		return fone;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getTipo() {
		return tipo;
	}
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return  Objects.equals(getCpf(), usuario.getCpf()) &&
                Objects.equals(getEmail(), usuario.getEmail()) &&
                Objects.equals(getNome(), usuario.getNome()) &&
                Objects.equals(getSenha(), usuario.getSenha())&&
                Objects.equals(getInstituicao(), usuario.getInstituicao())&&
        		Objects.equals(getFone(), usuario.getFone())&&
        		Objects.equals(getMatricula(), usuario.getMatricula())&&
        	    Objects.equals(getTipo(), usuario.getTipo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf(), getEmail(), getNome(), getSenha(), getInstituicao(), getFone(), getMatricula(), getTipo());
    }
}