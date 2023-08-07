package org.example.model;

import java.util.ArrayList;

public class Arguments {
        private String sortType = "-a";
        private String dataType;
        private String outputFileName;
        private ArrayList<String> inputFileNames = new ArrayList<>();

        public String getSortType() {
            return sortType;
        }

        public void setSortType(String sortType) {
            this.sortType = sortType;
        }

        public String getDataType() {
            return dataType;
        }

        public void setDataType(String dataType) {
            this.dataType = dataType;
        }

        public String getOutputFileName() {
            return outputFileName;
        }

        public void setOutputFileName(String outputFileName) {
            this.outputFileName = outputFileName;
        }

        public ArrayList<String> getInputFileNames() {
            return inputFileNames;
        }

        public void setInputFileNames(ArrayList<String> inputFileNames) {
            this.inputFileNames = inputFileNames;
        }
    }
