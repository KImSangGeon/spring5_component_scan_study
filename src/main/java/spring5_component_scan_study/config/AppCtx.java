package spring5_component_scan_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5_component_scan_study.spring.ChangePasswordService;
import spring5_component_scan_study.spring.MemberDao;
import spring5_component_scan_study.spring.MemberInfoPrinter;
import spring5_component_scan_study.spring.MemberListPrinter;
import spring5_component_scan_study.spring.MemberPrinter;
import spring5_component_scan_study.spring.MemberRegisterService;
import spring5_component_scan_study.spring.VersionPrinter;

@Configuration
public class AppCtx {
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter(/* memberDao(), memberPrinter() */);
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
//		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
//		infoPrinter.setMemberDao(memberDao());
//		infoPrinter.setPrinter(memberPrinter());
		return  new MemberInfoPrinter();
		}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(/* memberDao() */);
	}
	@Bean
	public ChangePasswordService changePwdSvc() {
//		ChangePasswordService pwdSvc = new ChangePasswordService() ;
//		pwdSvc.setMemberDao(memberDao());
		return new ChangePasswordService() ;
	}
//	@Bean
//	public  SelectListService memberSelSvc() {
//		return new SelectListService(memberDao());
//	}
	
	
	
	
	
	
	
}