package exception07;

public class OnePieceDao {
	
	ExDB db;
	
	OnePieceDao(){
		db = new ExDB();
	}
	
	public String selectOne(String id) throws MyException {
		if(id.equals("")) {
			throw new MyException("빈값이 입력되었음");
		}
		String rs = db.map.get(id);
		return rs;
		
	}
}
