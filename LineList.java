package quesBank3;

import java.util.Vector;

class LineList implements ListOfLines{
	Vector<Line> lines;
	public LineList(Vector<Line> lines) {
		this.lines = lines;
	}
	@Override
	public Vector<Line> getLinesFromStartingPoint(Point p){
		Vector<Line> res = new Vector<>();
		for(int i=0;i<lines.size();i++) {
			line curlin = lines.elementAt(i);
			if(test(curlin.getStart(),p))
				res.add(curlin);
		}
		return res;
	}
	private boolean test(Point a, Point b) {
		return a.getX() == b.getX() && a.getY() == b.getY();
		}
	public Line getLinewithMaxLength() {
		Line maxl = lines.elementAt(0);
		for(int i=1; i<lines.size();i++) {
			if(lines.elementAt(i).getLineLength()>maxl.getLineLength())
				maxl = lines.elementAt(i);
		}
		return maxl;
	}
}

public class LineList {

}
