package com.tit.stringbuffer.comparestringbufferwithstringbuilder;


    public class StringConcatComparison {
        // Number of strings to concatenate
        int numStrings = 1000000;
        String str = "hello";
        public long  concatenationStringBuffer() {

            // Compare performance of StringBuffer
            long startTime = System.nanoTime();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < numStrings; i++) {
                stringBuffer.append(str);
            }
            long endTime = System.nanoTime();
            long durationStringBuffer = endTime - startTime;

            // Output the time taken by both classes
            return durationStringBuffer;
        }

        public long concatenationStringBuilder(){
            // Compare performance of StringBuilder
            long startTime = System.nanoTime();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < numStrings; i++) {
                stringBuilder.append(str);
            }
            long endTime = System.nanoTime();
            long durationStringBuilder = endTime - startTime;

            // Output the time taken by both classes
            return durationStringBuilder;
        }

    }




