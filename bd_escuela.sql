
--CORREN ESTO
CREATE TABLESPACE ESCUELA
DATAFILE 'C:/ESCUELA/ESCUELA.DBF' SIZE 100M 
AUTOEXTEND ON;

--ESTO TAMBIEN
CREATE USER ADMIN
IDENTIFIED BY ROOT
DEFAULT TABLESPACE ESCUELA;

--DAN ESTOS PERMISOS
GRANT DBA TO ADMIN;
GRANT CONNECT TO ADMIN;

--CREAN UNA NUEVA CONEXION Y PONEN COMO USUARIO ADMIN Y DE CONTRASENA ROOT
CONN ADMIN/ROOT;--ESTO NO SE CORRE
--EJECUTAN TODAS ESTAS TABLAS DENTRO DEL USUARIO...
CREATE TABLE PROVINCIA
(
	ID_PROVINCIA INT,
	PROVINCIA VARCHAR(30) NOT NULL,
	CONSTRAINT PK_PROVINCIA PRIMARY KEY (ID_PROVINCIA)
);

select * from provincia;

CREATE TABLE PROFESOR
(
	ID_PROFESOR INT,
	NOMBRE VARCHAR(30) NOT NULL,
	APELLIDO1 VARCHAR(30) NOT NULL,
	APELLIDO2 VARCHAR(30) NOT NULL,
	CORREO VARCHAR(70) NOT NULL,
	TELEFONO VARCHAR(15) NOT NULL,
	ID_PROVINCIA INT NOT NULL,
	CONSTRAINT PK_PROFESOR PRIMARY KEY (ID_PROFESOR),
	CONSTRAINT FK_PROFE_PROV FOREIGN KEY (ID_PROVINCIA) REFERENCES PROVINCIA(ID_PROVINCIA)
);

SELECT * FROM PROFESOR;

CREATE TABLE CURSO
(
	ID_CURSO INT,
	CURSO VARCHAR(60) NOT NULL,
	ID_PROFESOR INT NOT NULL,
	CONSTRAINT PK_CURSO PRIMARY KEY (ID_CURSO),
	CONSTRAINT FK_CURSO_PROFE FOREIGN KEY (ID_PROFESOR) REFERENCES PROFESOR(ID_PROFESOR)
);


SELECT * FROM CURSO;

--ESTA SERIA LA UBICACION
CREATE TABLE PABELLON
(
	ID_PABELLON INT,
	DESCRIPCION VARCHAR(30) NOT NULL,
	CONSTRAINT PK_PABELLON PRIMARY KEY (ID_PABELLON)
);

SELECT * FROM PABELLON;


CREATE TABLE AULA
(
	ID_AULA INT,
	CAPACIDAD_AULA INT NOT NULL,
	ID_PABELLON INT NOT NULL,
	CONSTRAINT PK_AULA PRIMARY KEY (ID_AULA),
	CONSTRAINT FK_AULA_PABELLON FOREIGN KEY (ID_PABELLON) REFERENCES PABELLON (ID_PABELLON)
);

select * from aula;


CREATE TABLE HORARIO
(
	ID_HORARIO INT,
	HORA_INGRESO VARCHAR(20) NOT NULL,
	HORA_SALIDA VARCHAR(20) NOT NULL,
	CONSTRAINT PK_HORARIO PRIMARY KEY (ID_HORARIO)
);

select * from HORARIO;

CREATE TABLE PADRE
(
	ID_PADRE INT,
	NOMBRE_PADRE VARCHAR(30) NOT NULL,
	APELLIDO_PADRE1 VARCHAR(40) NOT NULL,
	APELLIDO_PADRE2 VARCHAR(40) NOT NULL,
	CORREO_PADRE VARCHAR(60) NOT NULL,
	TELEFONO_CONTACTO VARCHAR(40) NOT NULL,
	ID_PROVINCIA INT NOT NULL,
	CONSTRAINT PK_PADRE PRIMARY KEY (ID_PADRE),
	CONSTRAINT FK_PADRE_PROV FOREIGN KEY (ID_PROVINCIA) REFERENCES PROVINCIA (ID_PROVINCIA)
);

select * from PADRE;

CREATE TABLE MADRE
(
	ID_MADRE INT,
	NOMBRE_MADRE VARCHAR(30) NOT NULL,
	APELLIDO_MADRE1 VARCHAR(40) NOT NULL,
	APELLIDO_MADRE2 VARCHAR(40) NOT NULL,
	CORREO_MADRE VARCHAR(60) NOT NULL,
	TELEFONO_CONTACTO VARCHAR(40) NOT NULL,
	ID_PROVINCIA INT NOT NULL,
	CONSTRAINT PK_MADRE PRIMARY KEY (ID_MADRE),
	CONSTRAINT FK_MADRE_PROV FOREIGN KEY (ID_PROVINCIA) REFERENCES PROVINCIA (ID_PROVINCIA)
);

select * from MADRE;

CREATE TABLE ESTUDIANTE
(
	ID_ESTUDIANTE INT,
	NOMBRE VARCHAR(40) NOT NULL,
	APELLIDO1 VARCHAR(40) NOT NULL,
	APELLIDO2 VARCHAR(40) NOT NULL,
	ID_PADRE INT NOT NULL,
	ID_MADRE INT NOT NULL,
	ID_PROVINCIA INT NOT NULL,
	CONSTRAINT PK_EST PRIMARY KEY (ID_ESTUDIANTE),
	CONSTRAINT FK_EST_PADRE FOREIGN KEY (ID_PADRE) REFERENCES PADRE (ID_PADRE),
	CONSTRAINT FK_EST_MADRE FOREIGN KEY (ID_MADRE) REFERENCES MADRE (ID_MADRE),
	CONSTRAINT FK_EST_PROV FOREIGN KEY (ID_PROVINCIA) REFERENCES PROVINCIA (ID_PROVINCIA)
);

SELECT * FROM ESTUDIANTE;

CREATE TABLE TRIMESTRE
(
	ID_TRIMESTRE INT,
	TRIMESTRE VARCHAR(20),
	CONSTRAINT PK_TRIM PRIMARY KEY (ID_TRIMESTRE)
);

SELECT * FROM TRIMESTRE;

CREATE TABLE NOTAS
(
	ID_NOTA INT,
	NOTA INT NOT NULL,
	ID_CURSO INT NOT NULL,
	ID_TRIMESTRE INT NOT NULL,
	ID_ESTUDIANTE INT NOT NULL,
	CONSTRAINT PK_NOTAS PRIMARY KEY (ID_NOTA),
	CONSTRAINT FK_NOTAS_CURSO FOREIGN KEY (ID_CURSO) REFERENCES CURSO (ID_CURSO),
	CONSTRAINT FK_NOTAS_TRIM FOREIGN KEY (ID_TRIMESTRE) REFERENCES TRIMESTRE (ID_TRIMESTRE),
	CONSTRAINT FK_NOTAS_EST FOREIGN KEY (ID_ESTUDIANTE) REFERENCES ESTUDIANTE (ID_ESTUDIANTE)
);

select * from Notas;


CREATE TABLE MATRICULA
(
	ID_MATRICULA INT,
	PRECIO_MATRICULA INT NOT NULL,
	ID_ESTUDIANTE INT NOT NULL,
	CONSTRAINT PK_MATRICULA PRIMARY KEY (ID_MATRICULA),
   CONSTRAINT FK_MAT_EST FOREIGN KEY (ID_ESTUDIANTE) REFERENCES ESTUDIANTE (ID_ESTUDIANTE)
);

select * from MATRICULA;

SELECT TABLE_NAME, TABLESPACE_NAME FROM USER_TABLES;
/* CREACION DE LOS SP*/
CREATE OR REPLACE PROCEDURE SP_Insertar_Profesor 
(ID_P in number, NombreP in varchar2, Apellido1P in varchar2, Apellido2P in varchar2,
CorreoP in varchar2, TelefonoP in varchar2, idprovincia in number)
as 
begin
    insert into PROFESOR
    values (ID_P, NombreP, Apellido1P, ApellidO2P, CorreoP,
    TelefonoP, idprovincia);
end;

CREATE OR REPLACE PROCEDURE SP_Actualizar_Profesor 
(ID_P in number, NombreP in varchar2, Apellido1P in varchar2, Apellido2P in varchar2,
CorreoP in varchar2, TelefonoP in varchar2, idprovincia in number)
as 
begin
    update profesor 
    set nombre = nombrep, apellido1 = apellido1p, apellido2 = apellido2p,
    correo = correop, telefono = telefonop, id_provincia = idprovincia
    where id_profesor = id_p;
end;

CREATE OR REPLACE PROCEDURE SP_Eliminar_Profesor 
(ID_P in number)
as 
begin
    delete from profesor where id_profesor = id_p;
end;

CREATE OR REPLACE PROCEDURE SP_Insertar_Curso
(ID_C in number, CursoP in varchar2, idprofesor in number)
as 
begin
    insert into curso
    values (ID_C, CursoP, idprofesor);
end;

CREATE OR REPLACE PROCEDURE SP_Actualizar_Curso
(ID_C in number, CursoP in varchar2, idprofesor in number)
as 
begin
    update curso
    set curso = cursop, id_profesor = idprofesor
    where id_curso = id_c;
end;

CREATE OR REPLACE PROCEDURE SP_Eliminar_Curso
(ID_C in number)
as 
begin
    delete from curso where id_curso = id_c;
end;


CREATE OR REPLACE PROCEDURE SP_Insertar_Pabellon
(ID_P in number, DescripcionP in varchar2)
as 
begin
    insert into pabellon
    values (ID_P, DescripcionP);
end;

CREATE OR REPLACE PROCEDURE SP_Actualizar_Pabellon
(ID_P in number, DescripcionP in varchar2)
as 
begin
    update pabellon
    set descripcion = DescripcionP
    where id_pabellon = id_p;
end;

CREATE OR REPLACE PROCEDURE SP_Eliminar_Pabellon
(ID_P in number)
as 
begin
    delete from pabellon where id_pabellon = ID_P;
end;


CREATE OR REPLACE PROCEDURE SP_Insertar_Aula
(ID_A in number, CapacidadP in number, idpabellon in number)
as 
begin
    insert into aula
    values (ID_a, capacidadp, idpabellon);
end;

CREATE OR REPLACE PROCEDURE SP_Actualizar_Aula
(ID_A in number, CapacidadP in number, idpabellon in number)
as 
begin
    update aula
    set capacidad_aula = capacidadp, id_pabellon = idpabellon
    where id_aula = id_a;
end;

CREATE OR REPLACE PROCEDURE SP_Eliminar_Aula
    (ID_AULA IN NUMBER)
AS
BEGIN
    DELETE FROM aula WHERE id_aula = ID_AULA;
    COMMIT; 
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        RAISE;   
END SP_Eliminar_Aula;

exec SP_Eliminar_Aula(2);


CREATE OR REPLACE PROCEDURE SP_Insertar_Horario
(ID_H in number, HoraI in varchar2, HoraS in varchar2)
as 
begin
    insert into horario
    values (ID_H, HoraI, HoraS);
end;
exec SP_Insertar_Horario(1, '2:00:00 pm', '4:00:00 pm');
select * from horario;

CREATE OR REPLACE PROCEDURE SP_Actualizar_Horario
(ID_H in number, HoraI in varchar2, HoraS in varchar2)
as 
begin
    update horario
    set hora_ingreso = HoraI, hora_salida = HoraS
    where id_horario = ID_H;
end;
exec SP_Actualizar_Horario(1, '2:00:00 pm', '5:00:00 pm');

CREATE OR REPLACE PROCEDURE SP_Eliminar_Horario
(ID_H in number)
as 
begin
    delete from horario where id_horario = ID_H;
end;
exec SP_Eliminar_Horario(2);

CREATE OR REPLACE PROCEDURE SP_Insertar_Padre 
(ID_P in number, NombreP in varchar2, Apellido1P in varchar2, Apellido2P in varchar2,
CorreoP in varchar2, TelefonoP in varchar2, idprovincia in number)
as 
begin
    insert into Padre
    values (ID_P, NombreP, Apellido1P, ApellidO2P, CorreoP,
    TelefonoP, idprovincia);
end;
exec SP_Insertar_Padre (1,'Juan','Ramirez','Soto','juan12@gmail.com','14785',1);
select * from madre

CREATE OR REPLACE PROCEDURE SP_Actualizar_Padre
(ID_P in number, NombreP in varchar2, Apellido1P in varchar2, Apellido2P in varchar2,
CorreoP in varchar2, TelefonoP in varchar2, idprovincia in number)
as 
begin
    update padre 
    set nombre_padre = nombrep, apellido_padre1 = apellido1p, apellido_padre2 = apellido2p,
    correo_padre = correop, telefono_contacto = telefonop, id_provincia = idprovincia
    where id_padre = id_p;
end;

CREATE OR REPLACE PROCEDURE SP_Eliminar_Padre
(ID_P in number)
as 
begin
    delete from padre where id_padre = id_p;
end;


CREATE OR REPLACE PROCEDURE SP_Insertar_Madre 
(ID_P in number, NombreP in varchar2, Apellido1P in varchar2, Apellido2P in varchar2,
CorreoP in varchar2, TelefonoP in varchar2, idprovincia in number)
as 
begin
    insert into Madre
    values (ID_P, NombreP, Apellido1P, ApellidO2P, CorreoP,
    TelefonoP, idprovincia);
end;


CREATE OR REPLACE PROCEDURE SP_Actualizar_Madre
(ID_P in number, NombreP in varchar2, Apellido1P in varchar2, Apellido2P in varchar2,
CorreoP in varchar2, TelefonoP in varchar2, idprovincia in number)
as 
begin
    update Madre 
    set nombre_madre = nombrep, apellido_madre1 = apellido1p, apellido_madre2 = apellido2p,
    correo_madre = correop, telefono_contacto = telefonop, id_provincia = idprovincia
    where id_madre = id_p;
end;

CREATE OR REPLACE PROCEDURE SP_Eliminar_Madre
(ID_P in number)
as 
begin
    delete from madre where id_madre = id_p;
end;

CREATE OR REPLACE PROCEDURE SP_Insertar_Estudiante
(ID_P in number, NombreP in varchar2, Apellido1P in varchar2, Apellido2P in varchar2,
idpadre in number, idmadre in number, idprovincia in number)
as 
begin
    insert into Estudiante
    values (ID_P, NombreP, Apellido1P, ApellidO2P, idpadre,
    idmadre, idprovincia);
end;
exec SP_Insertar_Estudiante(13,'Lucas', 'Salas', 'Delgado', 1,1, 1);
select * from Estudiante;


CREATE OR REPLACE PROCEDURE SP_Actualizar_Estudiante
(ID_P in number, NombreP in varchar2, Apellido1P in varchar2, Apellido2P in varchar2,
idpadre in number, idmadre in number, idprovincia in number)
as 
begin
    update Estudiante 
    set nombre = nombrep, apellido1 = apellido1p, apellido2 = apellido2p,
    id_padre = idpadre, id_madre = idmadre, id_provincia = idprovincia
    where id_estudiante = id_p;
end;
exec SP_Actualizar_Estudiante(124,'Mia', 'Salas', 'Delgado', 123,123, 1);


CREATE OR REPLACE PROCEDURE SP_Eliminar_Estudiante
(ID_P in number)
as 
begin
    delete from estudiante where id_estudiante = id_p;
end;


CREATE OR REPLACE PROCEDURE SP_Insertar_Nota
(ID_P in number, notaP in number, idcurso in number, idtrimestre in number, 
idestudiante in number)
as 
begin
    insert into notas
    values (ID_P, notaP, idcurso, idtrimestre, idestudiante);
end;

exec SP_Insertar_Nota(2,80,4,3,1);

CREATE OR REPLACE PROCEDURE SP_Actualizar_Nota
(ID_P in number, notaP in number, idcurso in number, idtrimestre in number, 
idestudiante in number)
as 
begin
    update notas 
    set nota = notap, id_curso = idcurso, id_trimestre = idtrimestre,
    id_estudiante = idestudiante
    where id_nota = id_p;
end;

CREATE OR REPLACE PROCEDURE SP_Eliminar_Nota
(ID_P in number)
as 
begin
    delete from notas where id_nota = id_p;
end;

CREATE OR REPLACE PROCEDURE SP_Insertar_Matricula
(ID_P in number, PrecioP in number, idestudiante in number)
as 
begin
    insert into matricula
    values (ID_P, PrecioP, idestudiante);
end;

CREATE OR REPLACE PROCEDURE SP_Actualizar_Matricula
(ID_P in number, PrecioP in number, idestudiante in number)
as 
begin
    update matricula 
    set PRECIO_MATRICULA = PrecioP, id_estudiante = idestudiante
    where id_matricula = ID_P;
end;

CREATE OR REPLACE PROCEDURE SP_Eliminar_Matricula
(ID_P in number)
as 
begin
    delete from matricula where id_matricula = ID_P;
end;
exec SP_Eliminar_Matricula(1);

CREATE OR REPLACE PROCEDURE Sp_Mostrar_Estudiantes(ID_A in number)
as 
begin
    Select  E.ID_ESTUDIANTE,E.NOMBRE,E.APELLIDO1,E.APELLIDO2,A.ID_AULA
	from ESTUDIANTE E
    
    Inner JOIN NOTAS N
	    ON N.ID_CURSO = C.ID_CURSO
    Inner JOIN CURSO C 
	    ON C.ID_CURSO = Z.ID_CURSO
    Inner JOIN CURSO_AULA Z
	    On Z.ID_AULA = A.ID_AULA
    Inner JOIN AULA A
	    ON A.ID_AULA = ID_A
      WHERE E.ID_ESTUDIANTE = N.ID_ESTUDIANTE
end;
exec Sp_Mostrar_Estudiantes;

CREATE OR REPLACE PROCEDURE Sp_Mostrar_Nota
(ID_E in number)
as 
cursor datos is  Select  E.ID_ESTUDIANTE,E.NOMBRE,E.APELLIDO1,E.APELLIDO2,C.CURSO,N.NOTA 
	from ESTUDIANTE E
    Inner JOIN NOTAS N
	    ON N.ID_ESTUDIANTE = E.ID_ESTUDIANTE
    Inner JOIN CURSO C
	    ON C.ID_CURSO = N.ID_CURSO
      WHERE E.ID_ESTUDIANTE = ID_E;
ID_EST INT ;
NOMB VARCHAR2 (50);
AP1 VARCHAR2 (50);
AP2 VARCHAR2 (50);
CURS VARCHAR2 (50);
CALIF INT;
begin
    open datos;
    loop
      fetch datos INTO ID_EST,NOMB,AP1,AP2,CURS,CALIF;
      exit when datos%notfound;
        dbms_output.put_line(ID_EST || ' ' || NOMB || ' ' || AP1 || ' ' || AP2 || ' ' || CURS || ' ' || CALIF);
        end loop;
        close datos;
end;
 EXEC Sp_Mostrar_Nota(2);
     
CREATE OR REPLACE PROCEDURE Sp_Mostrar_Grupo
    (ID_E in number)
AS
BEGIN
    FOR rec IN
    (   SELECT  E.ID_ESTUDIANTE, E.NOMBRE, E.APELLIDO1, E.APELLIDO2, A.ID_AULA
        FROM ESTUDIANTE E
        INNER JOIN NOTAS N ON E.ID_ESTUDIANTE = N.ID_ESTUDIANTE
        INNER JOIN CURSO C ON N.ID_CURSO = C.ID_CURSO
        INNER JOIN CURSO_AULA Z ON C.ID_CURSO = Z.ID_CURSO
        INNER JOIN AULA A ON Z.ID_AULA = A.ID_AULA
        WHERE E.ID_ESTUDIANTE = ID_E
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE('ID_ESTUDIANTE: ' || rec.ID_ESTUDIANTE);
        DBMS_OUTPUT.PUT_LINE('NOMBRE: ' || rec.NOMBRE);
        DBMS_OUTPUT.PUT_LINE('APELLIDO1: ' || rec.APELLIDO1);
        DBMS_OUTPUT.PUT_LINE('APELLIDO2: ' || rec.APELLIDO2);
        DBMS_OUTPUT.PUT_LINE('ID_AULA: ' || rec.ID_AULA);
    END LOOP;
END Sp_Mostrar_Grupo;

CREATE OR REPLACE PROCEDURE Sp_Mostrar_Profesor
    (ID_p in number)
AS
BEGIN
    FOR rec IN
    (   SELECT P.ID_PROFESOR, P.NOMBRE, P.APELLIDO1, P.APELLIDO2, P.CORREO, P.TELEFONO
        FROM PROFESOR P
        WHERE P.ID_PROFESOR = ID_p
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE('ID_PROFESOR: ' || rec.ID_PROFESOR);
        DBMS_OUTPUT.PUT_LINE('NOMBRE: ' || rec.NOMBRE);
        DBMS_OUTPUT.PUT_LINE('APELLIDO1: ' || rec.APELLIDO1);
        DBMS_OUTPUT.PUT_LINE('APELLIDO2: ' || rec.APELLIDO2);
        DBMS_OUTPUT.PUT_LINE('CORREO: ' || rec.CORREO);
        DBMS_OUTPUT.PUT_LINE('TELEFONO: ' || rec.TELEFONO);
    END LOOP;
END Sp_Mostrar_Profesor;



CREATE OR REPLACE PROCEDURE Sp_Mostrar_Aula
    (ID_A in number)
AS
BEGIN
    FOR rec IN
    (   SELECT  A.ID_AULA, C.CURSO, P.DESCRIPCION
        FROM AULA A
        INNER JOIN CURSO_AULA Z ON A.ID_AULA = Z.ID_AULA
        INNER JOIN CURSO C ON Z.ID_CURSO = C.ID_CURSO
        INNER JOIN PABELLON P ON A.ID_PABELLON = P.ID_PABELLON
        WHERE A.ID_AULA = ID_A
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE('ID_AULA: ' || rec.ID_AULA);
        DBMS_OUTPUT.PUT_LINE('CURSO: ' || rec.CURSO);
        DBMS_OUTPUT.PUT_LINE('DESCRIPCION: ' || rec.DESCRIPCION);
    END LOOP;
END Sp_Mostrar_Aula;

CREATE OR REPLACE PROCEDURE Sp_Mostrar_Horario
AS
BEGIN
    FOR rec IN
    (   SELECT  H.ID_HORARIO, H.HORA_INGRESO, H.HORA_SALIDA, C.CURSO, A.ID_AULA, P.DESCRIPCION
        FROM HORARIO H
        INNER JOIN CURSO_HORARIO Z ON H.ID_HORARIO = Z.ID_HORARIO
        INNER JOIN CURSO C ON Z.ID_CURSO = C.ID_CURSO
        INNER JOIN CURSO_AULA Y ON C.ID_CURSO = Y.ID_CURSO
        INNER JOIN AULA A ON Y.ID_AULA = A.ID_AULA
        INNER JOIN PABELLON P ON A.ID_PABELLON = P.ID_PABELLON
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE('ID_HORARIO: ' || rec.ID_HORARIO);
        DBMS_OUTPUT.PUT_LINE('HORA_INGRESO: ' || rec.HORA_INGRESO);
        DBMS_OUTPUT.PUT_LINE('HORA_SALIDA: ' || rec.HORA_SALIDA);
        DBMS_OUTPUT.PUT_LINE('CURSO: ' || rec.CURSO);
        DBMS_OUTPUT.PUT_LINE('ID_AULA: ' || rec.ID_AULA);
        DBMS_OUTPUT.PUT_LINE('DESCRIPCION: ' || rec.DESCRIPCION);
    END LOOP;
END Sp_Mostrar_Horario;



CREATE OR REPLACE PROCEDURE Sp_Mostrar_Materia
    (ID_M in number)
AS
BEGIN
    FOR rec IN
    (   SELECT  C.ID_CURSO, C.CURSO, A.ID_AULA, P.DESCRIPCION, Y.ID_PROFESOR, Y.NOMBRE, Y.APELLIDO1, Y.APELLIDO2
        FROM CURSO C
        INNER JOIN CURSO_AULA Z ON C.ID_CURSO = Z.ID_CURSO
        INNER JOIN AULA A ON Z.ID_AULA = A.ID_AULA
        INNER JOIN PABELLON P ON A.ID_PABELLON = P.ID_PABELLON
        INNER JOIN PROFESOR Y ON C.ID_PROFESOR = Y.ID_PROFESOR
        WHERE C.ID_CURSO = ID_M
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE('ID_CURSO: ' || rec.ID_CURSO);
        DBMS_OUTPUT.PUT_LINE('CURSO: ' || rec.CURSO);
        DBMS_OUTPUT.PUT_LINE('ID_AULA: ' || rec.ID_AULA);
        DBMS_OUTPUT.PUT_LINE('DESCRIPCION: ' || rec.DESCRIPCION);
        DBMS_OUTPUT.PUT_LINE('ID_PROFESOR: ' || rec.ID_PROFESOR);
        DBMS_OUTPUT.PUT_LINE('NOMBRE: ' || rec.NOMBRE);
        DBMS_OUTPUT.PUT_LINE('APELLIDO1: ' || rec.APELLIDO1);
        DBMS_OUTPUT.PUT_LINE('APELLIDO2: ' || rec.APELLIDO2);
    END LOOP;
END Sp_Mostrar_Materia;


CREATE OR REPLACE PROCEDURE Sp_Notas_Altas
    (ID_C in number)
AS
BEGIN
    FOR rec IN
    (   SELECT E.ID_ESTUDIANTE, E.NOMBRE, E.APELLIDO1, E.APELLIDO2, N.NOTA, C.CURSO
        FROM CURSO C
        INNER JOIN NOTAS N ON C.ID_CURSO = N.ID_CURSO
        INNER JOIN ESTUDIANTE E ON E.ID_ESTUDIANTE = N.ID_ESTUDIANTE
        WHERE C.ID_CURSO = ID_C
        ORDER BY N.NOTA DESC
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE('ID_ESTUDIANTE: ' || rec.ID_ESTUDIANTE);
        DBMS_OUTPUT.PUT_LINE('NOMBRE: ' || rec.NOMBRE);
        DBMS_OUTPUT.PUT_LINE('APELLIDO1: ' || rec.APELLIDO1);
        DBMS_OUTPUT.PUT_LINE('APELLIDO2: ' || rec.APELLIDO2);
        DBMS_OUTPUT.PUT_LINE('NOTA: ' || rec.NOTA);
        DBMS_OUTPUT.PUT_LINE('CURSO: ' || rec.CURSO);
    END LOOP;
END Sp_Notas_Altas;



insert into provincia values (1, 'San Jose');
insert into provincia values (2, 'Cartago');
insert into provincia values (3, 'Heredia');
insert into provincia values (4, 'Alajuela');
insert into provincia values (5, 'Limon');
insert into provincia values (6, 'Puntarenas');
insert into provincia values (7, 'Guanacaste');

insert into trimestre values (1, 'I Trimestre');
insert into trimestre values (2, 'II Trimestre');
insert into trimestre values (3, 'III Trimestre');
select * from provincia

/*CREACION DEL TIRGGER*/
--1--
CREATE OR REPLACE TRIGGER Ingresar_Estudiante
before insert ON ESTUDIANTE
FOR EACH ROW
DECLARE
BEGIN
    dbms_output.put_line(TO_CHAR(SYSDATE, 'MM-DD-YYYY HH24:MI:SS')|| ' Se ha ingresado nueva informacion de un estudiante ' );
END;
--2--
CREATE OR REPLACE TRIGGER Ingresar_Padre
BEFORE INSERT ON PADRE
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE(TO_CHAR(SYSDATE, 'MM-DD-YYYY HH24:MI:SS') || ' Se ha ingresado nueva informacion de un Padre');
END;

exec SP_Insertar_Estudiante(22,'Lucas', 'Salas', 'Delgado', 1,1, 1);

--3--
CREATE OR REPLACE TRIGGER Ingresar_Madre
BEFORE INSERT ON MADRE
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE(TO_CHAR(SYSDATE, 'MM-DD-YYYY HH24:MI:SS') || ' Se ha ingresado nueva informacion de una Madre');
END;
--4--
CREATE OR REPLACE TRIGGER Ingresar_Profesor
BEFORE INSERT ON PROFESOR
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE(TO_CHAR(SYSDATE, 'MM-DD-YYYY HH24:MI:SS') || ' Se ha ingresado nueva informacion de un profesor');
END;
--5--
CREATE OR REPLACE TRIGGER Actualizar_Promedio_Curso
AFTER UPDATE ON NOTAS
FOR EACH ROW
DECLARE
    promedio NUMBER;
BEGIN
    -- Calcular el promedio de notas para el curso correspondiente
    SELECT AVG(NOTA) INTO promedio
    FROM NOTAS
    WHERE ID_CURSO = :NEW.ID_CURSO;

    DBMS_OUTPUT.PUT_LINE('El promedio del curso ' || :NEW.ID_CURSO || ' es ' || promedio);
END;

/*FUNCIONES*/
--Mostrar cantidad estudiantes--
CREATE OR REPLACE FUNCTION CantidadEstudiantes RETURN VARCHAR2
AS
    cantidad INT;
    mensaje VARCHAR2(50);
    
BEGIN
    SELECT COUNT (*) INTO cantidad FROM ESTUDIANTE;
     
    RETURN cantidad;
END;
select CantidadEstudiantes from dual;
--Función para obtener el promedio de notas de un estudiante en un trimestre específico--
CREATE OR REPLACE FUNCTION ObtenerPromedioEstudianteTrimestre(ID_Estudiante IN NUMBER, ID_Trimestre IN NUMBER)
RETURN NUMBER
AS
    promedio NUMBER;
BEGIN
    SELECT AVG(NOTA) INTO promedio
    FROM NOTAS
    WHERE ID_ESTUDIANTE = ID_Estudiante AND ID_TRIMESTRE = ID_Trimestre;
    
    RETURN promedio;
END;
--Función para contar la cantidad de estudiantes en un curso--
CREATE OR REPLACE FUNCTION ContarEstudiantesCurso(ID_Curso IN NUMBER)
RETURN NUMBER
AS
    cantidad NUMBER;
BEGIN
    SELECT COUNT(*) INTO cantidad
    FROM ESTUDIANTE
    WHERE ID_CURSO = ID_Curso;
    
    RETURN cantidad;
END;
--Función para obtener el nombre completo de un profesor--
CREATE OR REPLACE FUNCTION ObtenerNombreCompletoProfesor(ID_Profesor IN NUMBER)
RETURN VARCHAR2
AS
    nombre_completo VARCHAR2(100);
BEGIN
    SELECT NOMBRE || ' ' || APELLIDO1 || ' ' || APELLIDO2 INTO nombre_completo
    FROM PROFESOR
    WHERE ID_PROFESOR = ID_Profesor;
    
    RETURN nombre_completo;
END;
--Función para calcular el monto total de matrículas pagadas por un estudiante--
CREATE OR REPLACE FUNCTION CalcularTotalMatriculasEstudiante(ID_Estudiante IN NUMBER)
RETURN NUMBER
AS
    total_monto NUMBER;
BEGIN
    SELECT SUM(PRECIO_MATRICULA) INTO total_monto
    FROM MATRICULA
    WHERE ID_ESTUDIANTE = ID_Estudiante;
    
    RETURN total_monto;
END;

--Función para obtener el trimestre con el promedio más alto de un estudiante--
CREATE OR REPLACE FUNCTION ObtenerTrimestreMejorPromedio(ID_Estudiante IN NUMBER)
RETURN VARCHAR2
AS
    trimestre VARCHAR2(20);
BEGIN
    SELECT T.TRIMESTRE INTO trimestre
    FROM NOTAS N
    INNER JOIN TRIMESTRE T ON N.ID_TRIMESTRE = T.ID_TRIMESTRE
    WHERE ID_ESTUDIANTE = ID_Estudiante
    ORDER BY NOTA DESC
    FETCH FIRST 1 ROWS ONLY;
    
    RETURN trimestre;
END;
--Función para verificar si un estudiante está matriculado en un curso específico--
CREATE OR REPLACE FUNCTION EstudianteMatriculadoEnCurso(ID_Estudiante IN NUMBER, ID_Curso IN NUMBER)
RETURN BOOLEAN
AS
    cantidad NUMBER;
BEGIN
    SELECT COUNT(*) INTO cantidad
    FROM MATRICULA
    WHERE ID_ESTUDIANTE = ID_Estudiante AND ID_CURSO = ID_Curso;
    
    RETURN cantidad > 0;
END;
--Función para calcular la diferencia de días entre dos fechas--
CREATE OR REPLACE FUNCTION DiferenciaDias(Fecha1 IN DATE, Fecha2 IN DATE)
RETURN NUMBER
AS
    dias NUMBER;
BEGIN
    dias := Fecha2 - Fecha1;
    RETURN ABS(dias);
END;
--Función para obtener el profesor con más cursos asignados--
CREATE OR REPLACE FUNCTION ProfesorConMasCursos RETURN VARCHAR2
AS
    nombre_profesor VARCHAR2(100);
BEGIN
    SELECT P.NOMBRE || ' ' || P.APELLIDO1 || ' ' || P.APELLIDO2 INTO nombre_profesor
    FROM PROFESOR P
    JOIN CURSO C ON P.ID_PROFESOR = C.ID_PROFESOR
    GROUP BY P.ID_PROFESOR, P.NOMBRE, P.APELLIDO1, P.APELLIDO2
    ORDER BY COUNT(C.ID_CURSO) DESC
    FETCH FIRST 1 ROWS ONLY;
    
    RETURN nombre_profesor;
END;

/*CURSORES*/
--Cursor Mostrar Estudiantes--
CREATE OR REPLACE PROCEDURE SP_Mostrar_Estudiantes

as 
cursor datos is select nombre || ' ' || Apellido1 || ' ' || Apellido2  from ESTUDIANTE;
nombre varchar2(50);
begin
    open datos; 
    loop
      fetch datos into nombre;
      exit when datos%notfound;
      dbms_output.put_line(nombre);
      end loop;
      close datos;
end;
exec SP_Mostrar_Estudiantes

--Cursor Mostrar Padres--
CREATE OR REPLACE PROCEDURE SP_Mostrar_Padres

as 
cursor datos is select Nombre_Padre || ' ' || Apellido_Padre1 || ' ' || Apellido_Padre2 || ' ' || Telefono_Contacto  from PADRE;
nombre varchar2(50);
begin
    open datos; 
    loop
      fetch datos into nombre;
      exit when datos%notfound;
      dbms_output.put_line(nombre);
      end loop;
      close datos;
end;
exec SP_Mostrar_Padres

--Cursor Mostrar Madres--
CREATE OR REPLACE PROCEDURE SP_Mostrar_Madres

as 
cursor datos is select Nombre_Madre || ' ' || Apellido_Madre1 || ' ' || Apellido_Madre2 || ' ' || Telefono_Contacto  from MADRE;
nombre varchar2(50);
begin
    open datos; 
    loop
      fetch datos into nombre;
      exit when datos%notfound;
      dbms_output.put_line(nombre);
      end loop;
      close datos;
end;
exec SP_Mostrar_Madres;


--Cursor Profesores que imparten un curso Especificos--
CREATE OR REPLACE PROCEDURE Sp_Mostrar_Profesores_Curso(ID_Curso IN NUMBER)
AS 
    CURSOR c_profesores IS 
        SELECT DISTINCT P.NOMBRE || ' ' || P.APELLIDO1 || ' ' || P.APELLIDO2 AS NOMBRE_PROFESOR
        FROM PROFESOR P
        JOIN CURSO C ON P.ID_PROFESOR = C.ID_PROFESOR
        WHERE C.ID_CURSO = ID_Curso;
        
    nombre_profesor VARCHAR2(100);
BEGIN
    OPEN c_profesores;
    LOOP
        FETCH c_profesores INTO nombre_profesor;
        EXIT WHEN c_profesores%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(nombre_profesor);
    END LOOP;
    CLOSE c_profesores;
END;

--Cursor Mostrar Estudiantes Especificos--
CREATE OR REPLACE PROCEDURE Sp_Mostrar_Cursos_Estudiante(ID_Estudiante IN NUMBER)
AS 
    CURSOR c_cursos IS 
        SELECT DISTINCT C.CURSO
        FROM CURSO C
        JOIN MATRICULA M ON C.ID_CURSO = M.ID_CURSO
        WHERE M.ID_ESTUDIANTE = ID_Estudiante;
        
    curso CURSO.CURSO%TYPE;
BEGIN
    OPEN c_cursos;
    LOOP
        FETCH c_cursos INTO curso;
        EXIT WHEN c_cursos%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(curso);
    END LOOP;
    CLOSE c_cursos;
END;


-- Cursor mostrar lasauls de un pabellon--
CREATE OR REPLACE PROCEDURE SP_Mostrar_Aulas_Pabellon(ID_Pabellon IN NUMBER) AS 
    CURSOR c_aulas_pabellon IS 
        SELECT A.ID_AULA, A.CAPACIDAD_AULA
        FROM AULA A
        WHERE A.ID_PABELLON = ID_Pabellon;
        
    id_aula AULA.ID_AULA%TYPE;
    capacidad_aula AULA.CAPACIDAD_AULA%TYPE;
BEGIN
    OPEN c_aulas_pabellon;
    LOOP
        FETCH c_aulas_pabellon INTO id_aula, capacidad_aula;
        EXIT WHEN c_aulas_pabellon%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('Aula ID: ' || id_aula || ', Capacidad: ' || capacidad_aula);
    END LOOP;
    CLOSE c_aulas_pabellon;
END;

--Cursor mostrar los padres de los estudiantes --
CREATE OR REPLACE PROCEDURE SP_Mostrar_Padres_Estudiantes AS 
    CURSOR c_padres_estudiantes IS 
        SELECT DISTINCT PAD.NOMBRE_PADRE || ' ' || PAD.APELLIDO_PADRE1 || ' ' || PAD.APELLIDO_PADRE2
        FROM PADRE PAD
        JOIN ESTUDIANTE EST ON PAD.ID_PADRE = EST.ID_PADRE
        JOIN MATRICULA MAT ON EST.ID_ESTUDIANTE = MAT.ID_ESTUDIANTE;
        
    nombre_padre VARCHAR2(150);
BEGIN
    OPEN c_padres_estudiantes;
    LOOP
        FETCH c_padres_estudiantes INTO nombre_padre;
        EXIT WHEN c_padres_estudiantes%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('Padre: ' || nombre_padre);
    END LOOP;
    CLOSE c_padres_estudiantes;
END;

-- Cursor Mostrar Profesores de una Provincia Específica
CREATE OR REPLACE PROCEDURE SP_Mostrar_Profesores_Provincia(ID_Provincia IN NUMBER) AS 
    CURSOR c_profesores_provincia IS 
        SELECT P.NOMBRE || ' ' || P.APELLIDO1 || ' ' || P.APELLIDO2 AS NOMBRE_PROFESOR
        FROM PROFESOR P
        WHERE P.ID_PROVINCIA = ID_Provincia;
        
    nombre_profesor VARCHAR2(100);
BEGIN
    OPEN c_profesores_provincia;
    LOOP
        FETCH c_profesores_provincia INTO nombre_profesor;
        EXIT WHEN c_profesores_provincia%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(nombre_profesor);
    END LOOP;
    CLOSE c_profesores_provincia;
END;

-- Cursor Mostrar Padres de Estudiantes con Notas Bajas
CREATE OR REPLACE PROCEDURE SP_Mostrar_Padres_Notas_Bajas AS 
    CURSOR c_padres_notas_bajas IS 
        SELECT DISTINCT PAD.NOMBRE_PADRE || ' ' || PAD.APELLIDO_PADRE1 || ' ' || PAD.APELLIDO_PADRE2 AS NOMBRE_PADRE
        FROM PADRE PAD
        JOIN ESTUDIANTE EST ON PAD.ID_PADRE = EST.ID_PADRE
        JOIN NOTAS NOTA ON EST.ID_ESTUDIANTE = NOTA.ID_ESTUDIANTE
        WHERE NOTA.NOTA < 70;
        
    nombre_padre VARCHAR2(150);
BEGIN
    OPEN c_padres_notas_bajas;
    LOOP
        FETCH c_padres_notas_bajas INTO nombre_padre;
        EXIT WHEN c_padres_notas_bajas%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(nombre_padre);
    END LOOP;
    CLOSE c_padres_notas_bajas;
END;

-- Cursor Mostrar Aulas con Capacidad Superior a un Valor
CREATE OR REPLACE PROCEDURE SP_Mostrar_Aulas_Capacidad(ID_Capacidad IN NUMBER) AS 
    CURSOR c_aulas_capacidad IS 
        SELECT A.ID_AULA, A.CAPACIDAD_AULA
        FROM AULA A
        WHERE A.CAPACIDAD_AULA > ID_Capacidad;
        
    id_aula AULA.ID_AULA%TYPE;
    capacidad_aula AULA.CAPACIDAD_AULA%TYPE;
BEGIN
    OPEN c_aulas_capacidad;
    LOOP
        FETCH c_aulas_capacidad INTO id_aula, capacidad_aula;
        EXIT WHEN c_aulas_capacidad%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('ID Aula: ' || id_aula || ', Capacidad: ' || capacidad_aula);
    END LOOP;
    CLOSE c_aulas_capacidad;
END;




/*PAQUETES*/
--Paquete para la gestión de estudiantes--
CREATE OR REPLACE PACKAGE PKG_Estudiantes AS
    PROCEDURE Insertar_Estudiante(
        ID_P IN NUMBER, NombreP IN VARCHAR2, Apellido1P IN VARCHAR2,
        Apellido2P IN VARCHAR2, idpadre IN NUMBER, idmadre IN NUMBER, idprovincia IN NUMBER);
    
    PROCEDURE Actualizar_Estudiante(
        ID_P IN NUMBER, NombreP IN VARCHAR2, Apellido1P IN VARCHAR2,
        Apellido2P IN VARCHAR2, idpadre IN NUMBER, idmadre IN NUMBER, idprovincia IN NUMBER);
    
    PROCEDURE Eliminar_Estudiante(ID_P IN NUMBER);
    
    FUNCTION Cantidad_Estudiantes RETURN NUMBER;
    
    FUNCTION Obtener_Estudiante(ID_P IN NUMBER) RETURN SYS_REFCURSOR;
END PKG_Estudiantes;

--Paquete para la gestión de profesores--
CREATE OR REPLACE PACKAGE PKG_Profesores AS
    PROCEDURE Insertar_Profesor(
        ID_P IN NUMBER, NombreP IN VARCHAR2, Apellido1P IN VARCHAR2,
        Apellido2P IN VARCHAR2, CorreoP IN VARCHAR2, TelefonoP IN VARCHAR2, idprovincia IN NUMBER);
    
    PROCEDURE Actualizar_Profesor(
        ID_P IN NUMBER, NombreP IN VARCHAR2, Apellido1P IN VARCHAR2,
        Apellido2P IN VARCHAR2, CorreoP IN VARCHAR2, TelefonoP IN VARCHAR2, idprovincia IN NUMBER);
    
    PROCEDURE Eliminar_Profesor(ID_P IN NUMBER);
    
    FUNCTION Obtener_Profesores RETURN SYS_REFCURSOR;
END PKG_Profesores;

--Paquete para la gestión de cursos--
CREATE OR REPLACE PACKAGE PKG_Cursos AS
    PROCEDURE Insertar_Curso(ID_C IN NUMBER, CursoP IN VARCHAR2, idprofesor IN NUMBER);
    
    PROCEDURE Actualizar_Curso(ID_C IN NUMBER, CursoP IN VARCHAR2, idprofesor IN NUMBER);
    
    PROCEDURE Eliminar_Curso(ID_C IN NUMBER);
    
    FUNCTION Obtener_Cursos RETURN SYS_REFCURSOR;
END PKG_Cursos;

--Paquete para la gestión de notas--
CREATE OR REPLACE PACKAGE PKG_Notas AS
    PROCEDURE Insertar_Nota(
        ID_P IN NUMBER, notaP IN NUMBER, idcurso IN NUMBER, idtrimestre IN NUMBER, idestudiante IN NUMBER);
    
    PROCEDURE Actualizar_Nota(
        ID_P IN NUMBER, notaP IN NUMBER, idcurso IN NUMBER, idtrimestre IN NUMBER, idestudiante IN NUMBER);
    
    PROCEDURE Eliminar_Nota(ID_P IN NUMBER);
    
    FUNCTION Obtener_Notas_Estudiante(ID_Estudiante IN NUMBER) RETURN SYS_REFCURSOR;
END PKG_Notas;

--Paquete para la gestión de matrículas--
CREATE OR REPLACE PACKAGE PKG_Matriculas AS
    PROCEDURE Insertar_Matricula(ID_P IN NUMBER, PrecioP IN NUMBER, idestudiante IN NUMBER);
    
    PROCEDURE Actualizar_Matricula(ID_P IN NUMBER, PrecioP IN NUMBER, idestudiante IN NUMBER);
    
    PROCEDURE Eliminar_Matricula(ID_P IN NUMBER);
    
    FUNCTION Obtener_Matriculas_Estudiante(ID_Estudiante IN NUMBER) RETURN SYS_REFCURSOR;
END PKG_Matriculas;

--Paquete para la gestión de padres y madres--
CREATE OR REPLACE PACKAGE PKG_Padres_Madres AS
    PROCEDURE Insertar_Padre(
        ID_P IN NUMBER, NombreP IN VARCHAR2, Apellido1P IN VARCHAR2,
        Apellido2P IN VARCHAR2, CorreoP IN VARCHAR2, TelefonoP IN VARCHAR2, idprovincia IN NUMBER);
    
    PROCEDURE Actualizar_Padre(
        ID_P IN NUMBER, NombreP IN VARCHAR2, Apellido1P IN VARCHAR2,
        Apellido2P IN VARCHAR2, CorreoP IN VARCHAR2, TelefonoP IN VARCHAR2, idprovincia IN NUMBER);
    
    PROCEDURE Eliminar_Padre(ID_P IN NUMBER);
    
    PROCEDURE Insertar_Madre(
        ID_P IN NUMBER, NombreP IN VARCHAR2, Apellido1P IN VARCHAR2,
        Apellido2P IN VARCHAR2, CorreoP IN VARCHAR2, TelefonoP IN VARCHAR2, idprovincia IN NUMBER);
    
    PROCEDURE Actualizar_Madre(
        ID_P IN NUMBER, NombreP IN VARCHAR2, Apellido1P IN VARCHAR2,
        Apellido2P IN VARCHAR2, CorreoP IN VARCHAR2, TelefonoP IN VARCHAR2, idprovincia IN NUMBER);
    
    PROCEDURE Eliminar_Madre(ID_P IN NUMBER);
    
    FUNCTION Obtener_Padres_Madres RETURN SYS_REFCURSOR;
END PKG_Padres_Madres;

--Paquete para la gestión de aulas y pabellones--
CREATE OR REPLACE PACKAGE PKG_Aulas_Pabellones AS
    PROCEDURE Insertar_Pabellon(ID_P IN NUMBER, DescripcionP IN VARCHAR2);
    
    PROCEDURE Actualizar_Pabellon(ID_P IN NUMBER, DescripcionP IN VARCHAR2);
    
    PROCEDURE Eliminar_Pabellon(ID_P IN NUMBER);
    
    END PKG_Aulas_Pabellones;