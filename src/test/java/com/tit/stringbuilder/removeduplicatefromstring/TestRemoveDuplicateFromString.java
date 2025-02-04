package com.tit.stringbuilder.removeduplicatefromstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestRemoveDuplicateFromString {
    @Test
    public void test1(){
        RemoveDuplicate rd=new RemoveDuplicate();
        String str=rd.removeDuplicate("karan");
        assertEquals("karn",str);
    }

}
