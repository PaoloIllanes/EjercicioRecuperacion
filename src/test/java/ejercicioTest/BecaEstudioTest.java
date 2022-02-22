package ejercicioTest;

import ejercicio.BecaDeEstudio;
import ejercicio.Helper;
import ejercicio.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class BecaEstudioTest {

    Utils utils = Mockito.mock(Utils.class);

    @BeforeAll
    public static void before(){
        MockedStatic<Helper> mocked = Mockito.mockStatic(Helper.class);
        mocked.when(()->Helper.aplicaBeca(234)).thenReturn(true);
        mocked.when(()->Helper.aplicaBeca(222)).thenReturn(true);
        mocked.when(()->Helper.aplicaBeca(333)).thenReturn(false);
    }



    @Test
    public void verifyBeca1()  {


        Mockito.when(utils.getNota(234)).thenReturn(90);
        BecaDeEstudio becaDeEstudio = new BecaDeEstudio(utils);
        String actualResult = becaDeEstudio.aplicaBeca(234);
        String expectedResult = "SI APLICA A BECA";
        Assertions.assertEquals(expectedResult,actualResult,"Error respuesta incorrecta");
        Mockito.verify(utils).getNota(234);


    }
    @Test
    public void verifyBeca2()  {


        Mockito.when(utils.getNota(222)).thenReturn(60);
        BecaDeEstudio becaDeEstudio = new BecaDeEstudio(utils);
        String actualResult = becaDeEstudio.aplicaBeca(222);
        String expectedResult = "NO APLICA A BECA POR PROMEDIO ACADEMICO";
        Assertions.assertEquals(expectedResult,actualResult,"Error respuesta incorrecta");
        Mockito.verify(utils).getNota(222);


    }
    @Test
    public void verifyBeca3()  {


        Mockito.when(utils.getNota(333)).thenReturn(90);
        BecaDeEstudio becaDeEstudio = new BecaDeEstudio(utils);
        String actualResult = becaDeEstudio.aplicaBeca(333);
        String expectedResult = "EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS";
        Assertions.assertEquals(expectedResult,actualResult,"Error respuesta incorrecta");



    }


}
