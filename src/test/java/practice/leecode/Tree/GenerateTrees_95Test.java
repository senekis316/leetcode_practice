package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.JacksonUtils;

import static org.junit.Assert.*;

public class GenerateTrees_95Test {

    @Test
    public void generateTrees() {

        GenerateTrees_95 generateTrees_95 = new GenerateTrees_95();
        System.out.println(JacksonUtils.toJson(generateTrees_95.generateTrees(3)));

    }
}