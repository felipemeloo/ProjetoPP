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

    public Usuario(String cpf, String email, String nome, String senha, String instituicao, String fone, String matricula) {
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.instituicao = instituicao;
        this.fone = fone;
        this.matricula = matricula;
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
        		Objects.equals(getMatricula(), usuario.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf(), getEmail(), getNome(), getSenha(), getInstituicao(), getFone(), getMatricula());
    }
}
