--Creamos una vista para mostrar las estadisticas que han surjido del partido.

CREATE OR REPLACE VIEW vista_estadisticas AS
    SELECT FECHA_INICIO "HORA INICIO", ROUND(FECHA_FIN - FECHA_INICIO, 2)*1440 "TIEMPO PARTIDA", KILLS_EQUIPO_LOCAL, KILLS_EQUIPO_VISITANTE, ORO_EQUIPO_LOCAL, ORO_EQUIPO_VISITANTE
    FROM PARTIDO;
    

    
