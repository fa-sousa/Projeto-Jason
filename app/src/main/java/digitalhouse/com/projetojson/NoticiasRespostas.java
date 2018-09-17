package digitalhouse.com.projetojson;

import java.util.List;

//o porque desta classe é que se o objeto do json vier com uma lista de noticias, vou criar um outro objeto para guardar esta lista
public class NoticiasRespostas {
    private List<Noticias> noticias;

    public NoticiasRespostas(){

    }

    public NoticiasRespostas(List<Noticias>noticias) {
        this.noticias = noticias;
    }

    public List<Noticias> getNoticias() {
        return noticias;
    }

    public void setNoticias(List<Noticias> noticias) {
        this.noticias = noticias;
    }



}
