package ejercicio;


public class BecaDeEstudio {


    Utils utils;

public BecaDeEstudio(Utils mock){
    utils =  mock;

}

public String aplicaBeca(int ci){
    String msg;
    int note;
    if(Helper.aplicaBeca(ci)){

        note = utils.getNota(ci);
        if(note>=90){
            msg="SI APLICA A BECA";
        }else{
            msg="NO APLICA A BECA POR PROMEDIO ACADEMICO";
        }
    }else{msg ="EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS";}

    return msg;
}

}
