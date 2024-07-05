create database cherrybite;
use cherrybite;
create table grupoalimento
( 
	idgrupoalimento      int not null primary key auto_increment,
	descripcion          varchar(45)
);

create table valornutricional
( 
	idvalornutricional   int not null primary key auto_increment,
	calorias             decimal(10,2),
	proteinas            decimal(10,2),
	grasas               decimal(10,2),
	carbohidratos        decimal(10,2),
	colesterol           decimal(10,2),
	sodio                decimal(10,2),
	potasio              decimal(10,2)
);

create table sexo
( 
	idsexo               int not null primary key auto_increment,
	descripcion          varchar(45)
);

create table usuario
( 
	idusuario            int not null primary key auto_increment,
	nomusuario           varchar(100),
	email                varchar(200),
	password             varchar(300),
	nombres              varchar(100),
	apellidos            varchar(100),
	activo               tinyint(1)
);
create table rol
( 
	idrol                int not null primary key auto_increment,
	nomrol               varchar(300)
);

create table categoria
( 
	idcategoria          int not null primary key auto_increment,
	descripcion          varchar(45)
);

create table nutriologa
( 
	idnutriologa         int not null primary key auto_increment,
	nombres              varchar(45),
	apellidos            varchar(45),
	email                varchar(120),
	telf                 varchar(11)
);

create table persona
( 
	idpersona            int not null primary key auto_increment,
	idnutriologa         int not null,
	idusuario            int not null,
	peso                 int,
	altura               int,
	imc                  int,
	edad                 int,
	idsexo               int not null,
	estado               boolean,
	foreign key (idnutriologa) references nutriologa(idnutriologa),
	foreign key (idusuario) references usuario(idusuario),
	foreign key (idsexo) references sexo(idsexo)
);

create table alimento
( 
	idalimento           int not null primary key auto_increment,
	nombre               varchar(20),
	porcion              int,
	idgrupoalimento      int not null,
	descripcion          varchar(45),
	imagen               varchar(500),
	idvalornutricional   int not null,
	foreign key (idgrupoalimento) references grupoalimento(idgrupoalimento),
	foreign key (idvalornutricional) references valornutricional(idvalornutricional)
);

create table habito
( 
	idhabito             int not null primary key auto_increment,
	descripcion          varchar(45),
	idcategoria          int not null,
	frecuencia           varchar(20),
	horadia              time,
	fechainicio          date,
	fechafin             date,
	progreso             int,
	foreign key (idcategoria) references categoria(idcategoria)
);

create table detalle_alimento
( 
	idpersona            int not null,
	idalimento           int not null,
	fecha                datetime,
	foreign key (idpersona) references persona(idpersona),
	foreign key (idalimento) references alimento(idalimento),
	primary key(idpersona,idalimento)
);

create table detalle_habito
(
	idpersona            int not null,
	idhabito             int not null,
	realizado            boolean,
    fecha				timestamp default CURRENT_TIMESTAMP,
	foreign key (idpersona) references persona(idpersona),
	foreign key (idhabito) references habito(idhabito),
    primary key(idpersona,idhabito)
);

create table usuario_rol
( 
	idusuario            int not null,
	idrol                int not null,
	primary key (idusuario, idrol),
	foreign key (idusuario) references usuario(idusuario),
	foreign key (idrol) references rol(idrol)
);

create table noticia
( 
	idnoticia             int not null primary key auto_increment,
	titulo          varchar(45),
	descripcion      varchar(300),
	imagen           varchar(500),
	fecha              date
);