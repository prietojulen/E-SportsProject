CREATE OR REPLACE PACKAGE PAQUETE_MUTANTE  AS
    SUELDOJUGADOR JUGADOR.SUELDO%TYPE :=NULL;
    SUELDOJUGADOR_OLD JUGADOR.SUELDO%TYPE :=NULL;
    PRESUPUESTOEQUIPO EQUIPO.PRESUPUESTO%TYPE :=NULL;
    CODIGOEQUIPO JUGADOR.EQUIPO_ID_EQUIPO%TYPE :=NULL;
    TITULARIDAD_NEW JUGADOR.TITULARIDAD%TYPE := NULL;
    TITULARIDAD_OLD JUGADOR.TITULARIDAD%TYPE := NULL;
END;