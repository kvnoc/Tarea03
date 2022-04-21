package clase05;

class Ecuacion
{
  double variableA;

  double variableB;

  double variableC;

  void establecerVariableA(double varA)
  {
    variableA = varA;
  }

  double obtenerVariableA()
  {
    return variableA;
  }

  void establecerVariableB(double varB)
  {
    variableB = varB;
  }

  double obtenerVariableB()
  {
    return variableB;
  }

  void establecerVariableC(double varC)
  {
    variableC = varC;
  }

  double obtenerVariableC()
  {
    return variableC;
  }

  double discriminante()
  {
    double discriminante;

    discriminante = Math.pow(obtenerVariableB(),2)-4*obtenerVariableA()*obtenerVariableC();

    return discriminante;
  }

  double ecuacion()
  {
    double ecuacion;

    ecuacion =(-(obtenerVariableB())+Math.sqrt(Math.pow(obtenerVariableB(),2)-4*obtenerVariableA()*obtenerVariableC()))/ 2*obtenerVariableA();
    
    return ecuacion;
  }
  double ecuacion2()
  {
    double ecuacion2;

    ecuacion2 =(-(obtenerVariableB())-Math.sqrt(Math.pow(obtenerVariableB(),2)-4*obtenerVariableA()*obtenerVariableC()))/ 2*obtenerVariableA();
    
    
    return ecuacion2;
  }
}