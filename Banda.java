public class Banda {
    private String nomeBanda;
    private String idBanda;
    private Artista membros;

    public Banda (String nomeBanda, String idBanda, Artista membros, String musica){
        validarNomeBanda(nomeBanda);
        validarIdBanda(idBanda);
        validarMembros(membros);

        if (membros == null) {
            throw new IllegalArgumentException("A banda precisa de membros!");
        }

        this.nomeBanda = nomeBanda;
        this.idBanda = idBanda;

        if (membros == null) {
            throw new IllegalArgumentException("A banda precisa de membros!");
        }
    }

    public Artista getMembro(){
        return membros;
    }

    public String getIdBanda(){
        return idBanda;
    }

    public String getNomeBanda(){
        return nomeBanda;
    }




























































}
