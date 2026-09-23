public class Artista {
    private String nome;
    private String id;
    private String instrumento;
    private boolean possuiBanda;
    
    public Artista(String nome, String id, String instrumento, String musica){
        validarNomeArtista(nome);
        validarId(id);
        validarInstrumento(instrumento);

        this.nome = nome;
        this.id = id;
        this.instrumento = instrumento;
        this.possuiBanda = false;
    }

     public String getNomeArtista(){
        return nome;
    }

     public String getId(){
        return id;
    }

     public String getInstrumento(){
        return instrumento;
    }

    private void validarNomeArtista(String nome) {
        if (nome == null || nome.trim().isEmpty()
) {
            throw new IllegalArgumentException("O Campo Nome é Obrigatório.");
    }
    }

    private void validarId(String id) {
        if (id == null || id.trim().isEmpty()
) {
            throw new IllegalArgumentException("O Campo ID é Obrigatório.");
         }
    }

    private void validarInstrumento(String instrumento) {
        if (instrumento == null || instrumento.trim().isEmpty()) {
            throw new IllegalArgumentException("O Campo Instrumento é Obrigatório.");
        }
    }

    public void setNomeArtista(String nome) {
        validarNomeArtista(nome);
        this.nome = nome;
    }

    public void setId(String id) {
        validarId(id);
        this.id = id;
    }

    public void setInstrumento(String instrumento) {
        validarInstrumento(instrumento);
        this.instrumento = instrumento;
    }

    public boolean isTem_Banda(){
        return possuiBanda;
    }

    public void bandaOn(){
        possuiBanda = true;
    }

    public void bandaOff(){
        possuiBanda = false;
    }

    public void exibirDados(){
    System.out.println("Nome: "+getNomeArtista());
    System.out.println("Id: "+getId());
    System.out.println("Instrumento: " + getInstrumento());

    if(isTem_Banda()) {
         System.out.println("O artista está atualmente em banda!!!");
     } else {
        System.out.println("O artista está atualmente sem banda!!!");
        }

    }
}    
