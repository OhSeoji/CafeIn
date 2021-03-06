package dao;

import java.util.List;
import java.util.Map;

import vo.BoardVo;

public interface BoardDao {

	List<BoardVo> selectList();
	List<BoardVo> selectList(Map map);
	BoardVo selectOne(int b_idx);
	
	//전체게시물갯수
	int           selectRowTotal();
	//검색조건별 게시물수
	int           selectRowTotal(Map map);
	
	int 		  insert(BoardVo vo)  throws Exception;
	int           update(BoardVo vo)  throws Exception;
	int           update_readhit(int b_idx)  throws Exception;
	int           update_use_yn(int b_idx) throws Exception; //삭제대한코드
	default int  delete(int b_idx)  throws Exception { return 0; }
	
	
}
