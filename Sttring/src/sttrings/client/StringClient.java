package sttrings.client;


import strings.entity.StringsEntity;
import strings.operations.StringOperations;

public class StringClient {

	public static void main(String[] args) {
		StringsEntity sentence=new StringsEntity("  my name is sudhanshu  ");
		sentence.setString(sentence.getString());
		StringOperations statement=new StringOperations();
		System.out.println(statement.countWords(sentence.getString()));
	}

}