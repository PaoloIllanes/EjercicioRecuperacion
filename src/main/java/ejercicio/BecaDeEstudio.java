package ejercicio;


public class BecaDeEstudio {


    Utils utils;

public BecaDeEstudio(Utils mock){
    utils =  mock;

}

public String aplicaBeca(int ci){
    String msg="";
    int note =0;
    if(Helper.aplicaBeca(ci)){

        note = utils.getNota(ci);
        if(pr)

    }else{msg ="EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS";}

    return msg;
}

}
