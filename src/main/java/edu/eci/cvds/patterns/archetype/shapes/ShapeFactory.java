package edu.eci.cvds.patterns.archetype.shapes;
import edu.eci.cvds.patterns.archetype.shapes.concrete.Triangle;
import edu.eci.cvds.patterns.archetype.shapes.concrete.Quadrilateral;
import edu.eci.cvds.patterns.archetype.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.archetype.shapes.concrete.Hexagon;
public class ShapeFactory {
    public static Shape create(RegularShapeType type){
        switch (type){
            case Triangle:
                return new Triangle();
            case Quadrilateral:
                return new Quadrilateral();
            case Pentagon:
                return new Pentagon();
            case Hexagon:
                return new Hexagon();

        }
        return null;
    }
}
