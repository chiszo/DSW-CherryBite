INSERT INTO rol (nomrol) VALUES
    ('ADMIN'),
    ('Usuario estándar'),
    ('Editor');

INSERT INTO nutriologa (nombres, apellidos, email, telf) VALUES
    ('María', 'López', 'maria.lopez@example.com', '123456789'),
    ('Alejandro', 'García', 'alejandro.garcia@example.com', '987654321'),
    ('Ana', 'Martínez', 'ana.martinez@example.com', '555123456');
-- 12345678
INSERT INTO usuario (nomusuario, email, password, nombres, apellidos, activo) VALUES
    ('chiszo', 'usuario1@example.com', '$2a$12$VTfCXTWnGcBV6G5.nYowgODiHF8m2bzj8jDbzisLDnwfakwd4nBVS', 'Juan', 'Pérez', 1),
    ('tijera', 'usuario2@example.com', '$2a$12$VTfCXTWnGcBV6G5.nYowgODiHF8m2bzj8jDbzisLDnwfakwd4nBVS', 'María', 'González', 1),
    ('holamundo', 'usuario3@example.com', '$2a$12$VTfCXTWnGcBV6G5.nYowgODiHF8m2bzj8jDbzisLDnwfakwd4nBVS', 'Pedro', 'Sánchez', 1);
    
    INSERT INTO sexo (descripcion) VALUES
    ('HOMBRE'),
    ('MUJER');

INSERT INTO persona (idnutriologa, idusuario, peso, altura, imc, edad, idsexo, estado) VALUES
    (1, 1, 70, 170, 24, 30, 2, 1),
    (2, 2, 65, 165, 23.8, 28, 1, 1),
    (3, 3, 75, 175, 24.5, 32, 1, 1);

INSERT INTO usuario_rol (idusuario, idrol) VALUES
    (1, 1),
    (2, 2),
    (3, 3);
    
INSERT INTO categoria (descripcion) VALUES
    ('Estudios'),
    ('Salud'),
    ('Ejercicio'),
    ('Cocina'),
    ('Entretenimiento');

INSERT INTO grupoalimento (descripcion) VALUES
    ('Frutas'),
    ('Cereales'),
    ('Carnes blancas'),
    ('Lácteos'),
    ('Huevos y lácteos'),
    ('Verduras'),
    ('Pastas'),
    ('Productos lácteos'),
    ('Pescados y mariscos'),
    ('Frutas tropicales'),
    ('Carnes rojas'),
    ('Cereales integrales'),
    ('Frutos secos'),
    ('Vegetales'),
    ('Pan y cereales');

INSERT INTO valornutricional (calorias, proteinas, grasas, carbohidratos, colesterol, sodio, potasio) VALUES
    (50, 2, 0.5, 12, 0.1, 5, 100),
    (120, 3, 1, 25, 0.2, 10, 150),
    (180, 25, 10, 5, 0.5, 15, 200),
    (90, 8, 4, 15, 0.3, 8, 120),
    (70, 6, 3, 10, 0.2, 6, 80),
    (30, 2, 0.5, 5, 0.1, 3, 50),
    (200, 12, 5, 30, 0.4, 12, 180),
    (150, 20, 8, 10, 0.3, 10, 160),
    (250, 30, 15, 5, 0.6, 18, 250),
    (60, 4, 1.5, 10, 0.2, 4, 70),
    (180, 22, 9, 20, 0.5, 14, 220),
    (160, 18, 7, 25, 0.4, 12, 200),
    (50, 3, 2, 5, 0.1, 5, 60),
    (40, 2, 1, 7, 0.1, 3, 40),
    (100, 5, 3, 15, 0.3, 6, 90);
    
    INSERT INTO alimento (nombre, porcion, idgrupoalimento, descripcion, imagen, idvalornutricional) VALUES
    ('Manzana', 1, 1, 'Fruta fresca', 'https://www.prensalibre.com/wp-content/uploads/2023/12/Beneficios-de-comer-una-manzana-diaria.jpg?quality=52', 1),
    ('Arroz', 50, 2, 'Arroz blanco cocido', 'https://cdn.recetasderechupete.com/wp-content/uploads/2023/02/Arroz-sin-almidon.jpg', 2),
    ('Pechuga de pollo', 100, 3, 'Pechuga de pollo a la plancha', 'https://www.recetasderechupete.com/wp-content/uploads/2022/07/Pollo-cocido.jpg', 3),
    ('Leche', 200, 4, 'Leche semidesnatada', 'https://upload.wikimedia.org/wikipedia/commons/0/0e/Milk_glass.jpg', 4),
    ('Huevo', 1, 5, 'Huevo cocido', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSuvC8DmPVsCsXoCMm7Cfh8QOamTsQG6YzSCg&s', 5),
    ('Espinacas', 50, 6, 'Espinacas frescas', 'https://www.conasi.eu/blog/wp-content/uploads/2023/07/recetas-con-espinacas-d.jpg', 6),
    ('Pasta', 80, 7, 'Pasta cocida al dente', 'https://imagenes.20minutos.es/files/image_1920_1080/uploads/imagenes/2021/09/13/fideos.jpeg', 7),
    ('Yogur', 150, 8, 'Yogur natural bajo en grasa', 'https://www.recetasnestlecam.com/sites/default/files/2023-02/cuenco-con-yogurt-griego.jpg%20banner%20desktop.jpg', 8),
    ('Salmón', 120, 9, 'Filete de salmón a la plancha', 'https://www.cucinare.tv/wp-content/uploads/2020/06/Salm%C3%B3n-rosado.jpg', 9),
    ('Plátano', 1, 10, 'Plátano maduro', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGzVJUw8ro13TNu2-dzpIMvYz1i9jnP8YApQ&s', 10),
    ('Ternera', 100, 11, 'Filete de ternera a la plancha', 'https://c8.alamy.com/compes/2x1ea7f/deliciosa-carne-de-ternera-frita-sobre-mesa-sobre-fondo-negro-2x1ea7f.jpg', 11),
    ('Quinoa', 50, 12, 'Quinoa cocida', 'https://www.recetasderechupete.com/wp-content/uploads/2020/09/quinoa-cocida-1200x828.jpg', 12),
    ('Nueces', 30, 13, 'Nueces crudas', 'https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Walnuts_-_whole_and_open_with_halved_kernel.jpg/640px-Walnuts_-_whole_and_open_with_halved_kernel.jpg', 13),
    ('Zanahoria', 80, 14, 'Zanahoria cruda', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLP1972kvnKtH-6XiwpYJ3R-lycuaBaKrKRA&s', 14),
    ('Pan integral', 50, 15, 'Pan integral tostado', 'https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/f1ec1b78-4db1-45ac-9189-40619b7fad74/Derivates/2c238c6b-e380-486e-b9dc-39e41695a5ba.jpg', 15);

INSERT INTO habito (idhabito,descripcion, idcategoria, frecuencia, horadia, fechainicio, fechafin, progreso) VALUES
    (1,'Hábito 1', 1, 'Diario', '08:00:00', '2023-01-01', null, 50),
    (2,'Hábito 2', 2, 'Semanal', '20:00:00', '2023-01-02', '2023-12-31', 75),
    (3,'Hábito 3', 3, 'Diario', '10:00:00', '2023-01-03', '2023-06-30', 60),
    (4,'Hábito 4', 4, 'Quincenal', '09:00:00', '2023-01-04', null, 40),
    (5,'Hábito 5', 5, 'Semanal', '18:00:00', '2023-01-05', '2023-11-30', 80),
    (6,'Hábito 6', 1, 'Diario', '07:00:00', '2023-01-06', '2023-07-31', 55),
    (7,'Hábito 7', 2, 'Mensual', '12:00:00', '2023-01-07', null, 70),
    (8,'Hábito 8', 3, 'Semanal', '19:00:00', '2023-01-08', '2023-10-31', 85),
    (9,'Hábito 9', 4, 'Diario', '06:00:00', '2023-01-09', '2023-08-31', 65),
    (10,'Hábito 10', 5, 'Mensual', '14:00:00', '2023-01-10', null, 45),
    (11,'Hábito 11', 1, 'Semanal', '17:00:00', '2023-01-11', '2023-09-30', 90),
    (12,'Hábito 12', 2, 'Diario', '11:00:00', '2023-01-12', '2023-07-31', 58),
    (13,'Hábito 13', 3, 'Quincenal', '15:00:00', '2023-01-13', null, 35),
    (14,'Hábito 14', 4, 'Semanal', '16:00:00', '2023-01-14', '2023-12-31', 72),
    (15,'Hábito 15', 5, 'Diario', '13:00:00', '2023-01-15', '2023-08-31', 68);
    
INSERT INTO detalle_alimento (idpersona, idalimento, fecha) VALUES
    (1, 1, '2023-01-01'),
    (2, 2, '2023-01-02'),
    (3, 3, '2023-01-03'),
    (1, 4, '2023-01-04'),
    (2, 5, '2023-01-05'),
    (3, 6, '2023-01-06'),
    (1, 7, '2023-01-07'),
    (2, 8, '2023-01-08'),
    (3, 9, '2023-01-09'),
    (1, 10, '2023-01-10'),
    (2, 11, '2023-01-11'),
    (3, 12, '2023-01-12'),
    (1, 13, '2023-01-13'),
    (2, 14, '2023-01-14'),
    (3, 15, '2023-01-15');

INSERT INTO detalle_habito (idpersona, idhabito, realizado) VALUES
    (1, 1, 1),
    (2, 2, 0),
    (3, 3, 1),
    (1, 4, 1),
    (2, 5, 0),
    (3, 6, 1),
    (1, 7, 1),
    (2, 8, 0),
    (3, 9, 1),
    (1, 10, 1),
    (2, 11, 0),
    (3, 12, 1),
    (1, 13, 1),
    (2, 14, 0),
    (3, 15, 1);
INSERT INTO noticia (titulo, descripcion, imagen, fecha) VALUES
('Beneficios de la Manzana', 'Descubre cómo una manzana al día puede mejorar tu salud.', 'https://www.prensalibre.com/wp-content/uploads/2023/12/Beneficios-de-comer-una-manzana-diaria.jpg?quality=52', '2024-06-01'),
('Superalimentos para el Corazón', 'Alimentos que ayudan a mantener un corazón saludable.', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPzSNQ0ax-kxlZ67FTmwJH6tD_WH2Aj_f5WQ&s', '2024-06-02'),
('Dieta Mediterránea', 'Conoce los beneficios de seguir una dieta mediterránea.', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRiTfirl8DCQr5lnOgYK3p7uBuF7r15y1Ok8Q&s', '2024-06-03'),
('Importancia del Desayuno', '¿Por qué no debes saltarte el desayuno?', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4-tRDfGjZQBaMaALcEm30KuKvJFid4KX7YA&s', '2024-06-04'),
('Alimentos Ricos en Fibra', 'Mejora tu digestión con estos alimentos ricos en fibra.', 'https://i.blogs.es/7dcb4a/fruta-fibra/1366_2000.jpg', '2024-06-05'),
('Reducir el Consumo de Azúcar', 'Consejos para reducir la ingesta de azúcar en tu dieta.', 'https://elcomercio.pe/resizer/873uMQW9ndmWoLXCRvdXTahqMSc=/1200x900/smart/filters:format(jpeg):quality(75)/arc-anglerfish-arc2-prod-elcomercio.s3.amazonaws.com/public/A35OONAGORGL3O3S76JMSYH5IQ.jpg', '2024-06-06'),
('Beneficios del Té Verde', 'El té verde y sus propiedades antioxidantes.', 'https://static.tuasaude.com/media/article/yp/dt/beneficios-del-te-verde_17350_l.jpg', '2024-06-07'),
('Pescado: Fuente de Omega-3', 'La importancia de incluir pescado en tu dieta.', 'https://esenciadelmar.es/wp-content/uploads/2023/08/formas-cocinar-pescado-1200x700.jpg', '2024-06-08'),
('Frutas Cítricas y la Vitamina C', 'Cómo las frutas cítricas fortalecen tu sistema inmunológico.', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWi9O5Ho88H0lJngzIPCFUapMDSmzsudXHBg&s', '2024-06-09'),
('Hidratación Adecuada', 'La importancia de mantener una buena hidratación.', 'https://www.pescanova.pe/wp-content/uploads/2021/08/como-hidratarse-en-el-verano-1.jpg', '2024-06-10'),
('Vegetales de Hoja Verde', 'Beneficios de los vegetales de hoja verde en tu dieta.', 'https://www.lavanguardia.com/files/og_thumbnail/uploads/2016/07/15/5fa2cf97121ce.jpeg', '2024-06-11'),
('Comida Rápida Saludable', 'Opciones de comida rápida que no perjudican tu salud.', 'https://www.clarin.com/2022/08/17/QoyfI4ouM_2000x1500__1.jpg', '2024-06-12'),
('Nueces y Semillas', 'Incluye nueces y semillas en tu dieta diaria.', 'https://www.revistamoi.com/wp-content/uploads/2019/08/nueces.jpg', '2024-06-13'),
('Alimentos para la Salud Cerebral', 'Mejora tu memoria con estos alimentos.', 'https://www.mgc.es/wp-content/uploads/2020/12/alimentos-para-la-memoria-THUMBNAIL2-1-1-1200x900.jpg', '2024-06-14'),
('Proteínas Vegetales', 'Alternativas vegetales para obtener proteínas.', 'https://www.kibofoods.com.co/wp-content/uploads/2021/02/ejemplos-de-proteinas-vegetales-para-incluir-en-tu-alimentacion-diaria-.jpg', '2024-06-15'),
('Planificación de Comidas', 'Cómo planificar tus comidas de manera saludable.', 'https://gnd-content.dev/blog/wp-content/uploads/2023/02/MENU-SEMANAL-4.jpg', '2024-06-16'),
('Reducir el Consumo de Sal', 'Consejos para disminuir la sal en tus comidas.', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ34phA9JHOthCyU1Hx6HAMS4p1sRfxmCeDgg&s', '2024-06-17'),
('Beneficios del Agua de Coco', 'Propiedades hidratantes y nutritivas del agua de coco.', 'https://www.clarin.com/2023/05/23/O1ysSpFFh_1200x0__1.jpg', '2024-06-18'),
('Alimentos Probióticos', 'Mejora tu salud intestinal con probióticos.', 'https://statics-cuidateplus.marca.com/cms/images/alimentos-fibra.jpg', '2024-06-19'),
('Hábitos Alimenticios Saludables', 'Consejos para mantener hábitos alimenticios saludables a largo plazo.', 'https://cdn.aarp.net/content/dam/aarp/health/healthy-living/2021/05/1140-health-calendar-reset-esp.jpg', '2024-06-20');
