package aula_14;

public class Aula_14 {
    public static void main(String[] args) {
        Video v[] = new Video[4];
        Inscrito i[] = new Inscrito[2];


        i[0] = new Inscrito("Sofia",20,"F","0001");
        i[1] = new Inscrito("Vinicius", 21, "M","0002");

        v[0] = new Video("Aula POO #3");
        v[1] = new Video("Aula Java #17");
        v[2] = new Video("Flutter TIPS");
        v[3] = new Video("Dart para backend");

        for (int j =0; j <10; j++){
            v[0].like();
        }
        for (int k =0; k <5; k++){
            v[1].like();
        }
        for (int j =0; j <25; j++){
            v[2].like();
        }
        for (int j =0; j <32; j++){
            v[3].like();
        }

        i[0].viuMaisUm(v[3]);

        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println(v[3].toString());
        System.out.println("=======================");
        System.out.println(i[0].toString());
        System.out.println(i[1].toString());
    }
}
