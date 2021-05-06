package spring5_component_scan_study.spring;

import java.util.Map;

public class SelectListService {
	
	private MemberDao memberdao;

	public SelectListService(MemberDao memberdao) {
		this.memberdao = memberdao;
	}
	
//	public Map<String, Member> selectAll(){
//		return memberdao.selectAll();
//		}	
}
