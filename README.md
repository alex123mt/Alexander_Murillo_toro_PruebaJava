create database RiwiAcademyDB;

use RiwiAcademyDB;

create table estudiantes(
id_estudiante int primary key auto_increment,
email varchar(100)not null,
estado varchar (20) not null,
nombre varchar (20) not null
);

create table cursos(
id_curso int primary key auto_increment,
nombre_curso varchar(30)
);

create table inscripciones(
id_inscripcion int primary key auto_increment,
id_estudiante_fk int not null,
foreign key (id_estudiante_fk) references estudiantes(id_estudiante),
id_curso_fk int not null,
foreign key (id_curso_fk) references cursos(id_curso)
);

create table calificaciones(
id_calificacion int primary key auto_increment,
descripcion text not null,
calificacion int not null,
id_estudiante_fk int not null,
foreign key (id_estudiante_fk) references estudiantes(id_estudiante),
id_curso_fk int not null,
foreign key (id_curso_fk) references cursos(id_curso)
);

select * from estudiantes;
select * from calificaciones;
select * from cursos;
select * from inscripciones;
