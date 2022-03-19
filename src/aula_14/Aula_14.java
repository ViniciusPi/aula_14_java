package aula_14;

public class Aula_14 {
    public static void main(String[] args) {
        Video v[] = new Video[4];
        Inscrito i[] = new Inscrito[2];
        Visualisacao view[] = new Visualisacao[3];

        i[0] = new Inscrito("Sofia", 20, "F", "0001");
        i[1] = new Inscrito("Vinicius", 21, "M", "0002");

        v[0] = new Video("Aula POO #3");
        v[1] = new Video("Aula Java #17");
        v[2] = new Video("Flutter TIPS");
        v[3] = new Video("Dart para backend");

        view[0] = new Visualisacao(v[0], i[1]);
        view[1] = new Visualisacao(v[2], i[1]);
        view[2] = new Visualisacao(v[3],i[0]);

        view[0].avaliar(70f);
        view[1].avaliar();
        view[2].avaliar(7);

        System.out.println(view[0].toString());
        System.out.println(view[1].toString());
        System.out.println(view[2].toString());

        System.out.println(v[0].toString());
        //System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println(v[3].toString());
        System.out.println("=======================");
        //System.out.println(i[0].toString());
        System.out.println(i[1].toString());


    }
}
