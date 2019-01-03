package org.jyp.povketbook.ansj;

import org.ansj.domain.Result;
import org.ansj.domain.Term;
import org.ansj.domain.TermNature;
import org.ansj.domain.TermNatures;
import org.ansj.splitWord.analysis.DicAnalysis;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.junit.Test;

public class AnsjTest {

	@Test
	public void parse() {
		String str = "车厘子香蕉黄瓜西红柿葡萄";

//		ToAnalysis s = new ToAnalysis();
		
		DicAnalysis s = new DicAnalysis();

//		s.getAmbiguityForest().
		
		
		Result r = s.parseStr(str);

		r.forEach(it -> {
//			if (it.getNatureStr().equals(TermNature.M.nature.natureStr)) {
			System.out.println(it);
//			}
		});

	}
}
