import java.util.Arrays;

enum Color{Red, Green, Blue, Yellow} //holding all possible colors of the pyramid

class Face {
    private Color[] tiles;
    public Face (Color color) { // initialize tiles array
        tiles = new Color[9];
        Arrays.fill(tiles, color);
    }
    public Color[] getTiles() { // accessor
        return tiles;
    }
}

public class PyramidRubik {
    private Face[] faces;

    public PyramidRubik() { // constructor to initialize faces and edges
        faces = new Face[4];
        InitializeFaces();
        InitializeEdges();
    }

    public Face[] getFaces() { // accessor
        return faces;
    }

    private void InitializeFaces() { // initialize the faces of the pyramid
        Color[] color = new Color[9];
        for (int i = 0; i < faces.length; i++) {
            faces[i] = new Face(color);
        }
    }

    private void InitializeEdges() { // initialize the edges of the pyramid
        Color color = new Color[4];
        for (int i = 0; i < faces.length; i++) {
            faces[i] = new Face(color);
        }
    }

    public boolean validatePyramid() { // ensure that the pyramid has 4 faces
        return (faces.length == 4);
    }
}
