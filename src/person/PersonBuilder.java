package person;

import common.drawer.Shape;
import face.FaceBuilder;
import face.SmileyFace;
import tree.Tree;
import tree.TreeBuilder;

import java.util.ArrayList;
import java.util.Collection;

public class PersonBuilder {

    public SmileyFace pFaceBuilder(String faceColour, String eyeColour, String bodyColour){
        FaceBuilder f1 = new FaceBuilder();
        Collection<Shape> circles = new ArrayList<>();
        Collection<Shape> crescents = new ArrayList<>();
        SmileyFace s1 = new SmileyFace(circles, crescents);

        s1.addCircle(f1.buildCircle(6,23,7,faceColour,1));
        s1.addCircle(f1.buildCircle(1,21,5,eyeColour,1));
        s1.addCircle(f1.buildCircle(1,25,5,eyeColour,1));
        s1.addCrescent(f1.buildHalfCircle(23,8,1,faceColour,1));

        return s1;

    }

    public Tree pBodyBuilder( String bodyColour){

        TreeBuilder f1 = new TreeBuilder();
        Tree t1 = new Tree();

        t1.addTrunk(f1.buildTrunk(9, 9,15,19,1, bodyColour));

        t1.addBranch(f1.buildBranch(14,12,30,1,5,1,bodyColour));
        t1.addBranch(f1.buildBranch(28,15,320,1,5,1,bodyColour));
        t1.addBranch(f1.buildBranch(19,24,150,1,5,1,bodyColour));
        t1.addBranch(f1.buildBranch(30,27,220,1,5,1,bodyColour));
        t1.addBranch(f1.buildBranch(23,13,90,1,1,1,bodyColour));

        return t1;

    }
}
