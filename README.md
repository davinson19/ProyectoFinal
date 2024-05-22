# Proyecto de Venta de Música por Internet

Este repositorio contiene la implementación de un sistema de venta de música por Internet. Los usuarios pueden comprar créditos para adquirir canciones, buscar las canciones que deseen y descargarlas en su ordenador. El sistema está diseñado para cumplir con la Ley Orgánica de Datos Personales y el Reglamento de medidas de seguridad.

---

## Contenidos del Repositorio

- **PDF descriptivo del proyecto:**
    - **Análisis de requisitos mejorado:** Un documento detallado que describe los requisitos funcionales y no funcionales del sistema.
    - **Diagrama de clases:** Imagen del diagrama de clases generado con STARUML.
    - **Diagrama de comportamiento:** Imagen del diagrama de comportamiento.
    - **Diagrama de grafos de flujo:** Diagramas de pruebas de caja blanca de los dos métodos más complejos de la aplicación.
- **Archivo .mdj:**
    - Archivo del diagrama StarUML lo más detallado posible, incluyendo la documentación Javadoc.
- **Documentación Javadoc:**
    - Carpeta comprimida con los HTML generados por Javadoc.
- **Código fuente:**
    - Todos los archivos `.java` de la aplicación. La aplicación debe poder ejecutarse y será presentada.
- **Implementación de testCase:**
    - Todos los archivos `.java` con la implementación de los testCase.

---

## Requisitos Iniciales

### Funcionalidad:
- Los usuarios comprarán créditos para adquirir canciones.
- Los usuarios buscarán las canciones que deseen y las pagarán con créditos.
- El sistema debe mostrar los resultados de una búsqueda en menos de cinco segundos. Si se supera este plazo, el sistema detendrá la búsqueda y mostrará los resultados encontrados.
- Los usuarios tendrán varios días para descargar las canciones adquiridas.
- El sistema debe permitir ofertas generales y particulares.

### Reglamentación:
- Cumplimiento de la Ley Orgánica de Datos Personales.
- Cumplimiento del Reglamento de medidas de seguridad.

### Compatibilidad:
- El sistema debe ser visible en cualquier navegador.

---

## Estructura del Repositorio

```plaintext
/
├── README.md
├── ProyectoDescriptivo.pdf
├── DiagramaClases.png
├── DiagramaComportamiento.png
├── DiagramaGrafosFlujo1.png
├── DiagramaGrafosFlujo2.png
├── DiagramaStarUML.mdj
├── Javadoc/
│   └── (archivos HTML generados por Javadoc)
├── src/
│   ├── main/
│   │   └── java/
│   │       └── (archivos .java de la aplicación)
│   └── test/
│       └── java/
│           └── (archivos .java con la implementación de los testCase)
└── build.gradle (o pom.xml)
```

---

## Instrucciones de Ejecución

Clonar el repositorio:
```bash
git clone https://github.com/tu_usuario/nombre_del_repositorio.git
```

Navegar al directorio del proyecto:

Copiar código
```bash
cd nombre_del_repositorio
```

Compilar y ejecutar la aplicación:

Copiar código
```bash
./gradlew build
./gradlew run
```

Generar la documentación Javadoc:

Copiar código
```bash
./gradlew javadoc
```

Ejecutar los testCase:

Copiar código
```bash
./gradlew test
```

---

## Contacto
### Para más información, contactar a:

Nombre de los Desarrolladores: 
- **Alejandro Mayor García** - alejandromayor02@gmail.com
- **David Hernández Carmona** - davidhdezcarmona@gmail.com
- **Youssef Habti** - tu_email@dominio.com
- **Pedro Ángel Millán** - tu_email@dominio.com

---

¡Gracias por revisar nuestro proyecto!
