# Diseño modular - Juego de Vampiros

<div align=center>

[![Diagrama de Clases](/images/modelosUML/Entrega1/Iteracion2/Diagrama_Entrega1.svg)](/images/modelosUML/Entrega1/Iteracion2/diagrama.puml)

</div>

# 1. **Descripción del Proyecto**

El Juego de Vampiros es un proyecto que implementa un sistema de combate por turnos donde el jugador controla a un Guerrero que debe enfrentarse a un Vampiro en una batalla estratégica. El sistema está desarrollado con un enfoque orientado a objetos en Java, aprovechando conceptos como herencia, polimorfismo y encapsulamiento.
La arquitectura del juego está diseñada para ser modular y extensible, permitiendo añadir fácilmente nuevos tipos de personajes, armas y habilidades en futuras versiones.

## Clases

**🧬 Clases Base**
| Clase | Descripción |
|-------|-------------|
| [Personaje](/src/JuegoVampiro/Personaje.java) | Clase abstracta base para todos los personajes del juego |
| [Ataque](/src/JuegoVampiro/Ataque.java) | Clase base para todos los tipos de ataques disponibles |

**🧱 Nivel Básico**
| Clase | Depende de / Usa | Descripción |
|-------|------------------|-------------|
| [Arma](/src/JuegoVampiro/Arma.java) | `Ataque` | Implementa los ataques específicos del Guerrero |
| [Mordida](/src/JuegoVampiro/Mordida.java) | `Ataque` | Implementa los ataques específicos del Vampiro |
| [Pocion](/src/JuegoVampiro/Pocion.java) | - | Gestiona el estado y efectos de las pociones curativas |

**🧩 Nivel Medio**
| Clase | Depende de / Usa | Descripción |
|-------|------------------|-------------|
| [Guerrero](/src/JuegoVampiro/Guerrero.java) | `Personaje`, `Arma`, `Pocion` | Representa al héroe controlado por el jugador |
| [Vampiro](/src/JuegoVampiro/Vampiro.java) | `Personaje`, `Mordida` | Representa al enemigo vampiro controlado por la IA |

**🧠 Nivel Alto**
| Clase | Depende de / Usa | Descripción |
|-------|------------------|-------------|
| [Batalla](/src/JuegoVampiro/Batalla.java) | `Guerrero`, `Vampiro` | Controla la lógica del combate por turnos |
| [JuegoVampiros](/src/JuegoVampiro/JuegoVampiros.java) | `Batalla`, `Guerrero`, `Vampiro` | Clase principal que gestiona todo el flujo del juego |

# 2. **Cambios Realizados**

## Cambios post revisión del 29/05
- Actualización del diagrama .puml
- Pequeños arreglos en el codigo
- Borrados todos los comentarios del código