SELECT * FROM JUGADOR WHERE EQUIPO_ID_EQUIPO = 1;
SELECT * FROM EQUIPO WHERE id_equipo = 1;

INSERT INTO JUGADOR VALUES(30, 'FSDFS', 'FDSFS', 'DSFSDF', 'FDFS', 1000, 0, 2);
INSERT INTO JUGADOR VALUES (30,'tim','liposev','nemesis','midlane',1000,1,2);

DELETE FROM JUGADOR WHERE ID_JUGADOR = 30;

UPDATE EQUIPO
SET PRESUPUESTO = 1200
WHERE ID_EQUIPO = 1;

SELECT * FROM user_errors;
SHOW ERRORS TRIGGER TRIGGER_PRES_EQ_MEN_SAL_JUG;

ALTER TRIGGER TRIGGER_PRES_EQ_MEN_SAL_JUG DISABLE;
DROP TRIGGER TRIGGER_PRES_EQ_MEN_SAL_JUG;

ALTER TRIGGER TRIGGER_PRES_EQ_MEN_SAL_JUG ENABLE;

