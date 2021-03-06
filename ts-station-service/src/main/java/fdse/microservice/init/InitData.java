package fdse.microservice.init;

import fdse.microservice.domain.Information;
import fdse.microservice.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StationService service;

    @Override
    public void run(String... args) throws Exception{
        Information info = new Information();

        info.setId("shanghai");
        info.setName("Shang Hai");
        info.setStayTime(10);
        service.create(info);

        info.setId("shanghaihongqiao");
        info.setName("Shang Hai Hong Qiao");
        info.setStayTime(10);
        service.create(info);

        info.setId("taiyuan");
        info.setName("Tai Yuan");
        info.setStayTime(5);
        service.create(info);

        info.setId("beijing");
        info.setName("Bei Jing");
        info.setStayTime(10);
        service.create(info);

        info.setId("nanjing");
        info.setName("Nan Jing");
        info.setStayTime(8);
        service.create(info);

        info.setId("shijiazhuang");
        info.setName("Shi Jia Zhuang");
        info.setStayTime(8);
        service.create(info);

        info.setId("xuzhou");
        info.setName("Xu Zhou");
        info.setStayTime(7);
        service.create(info);


        info.setId("jinan");
        info.setName("Ji Nan");
        info.setStayTime(5);
        service.create(info);

        info.setId("hangzhou");
        info.setName("Hang Zhou");
        info.setStayTime(9);
        service.create(info);

        info.setId("jiaxingnan");
        info.setName("Jia Xing Nan");
        info.setStayTime(2);
        service.create(info);

        info.setId("zhenjiang");
        info.setName("Zhen Jiang");
        info.setStayTime(2);
        service.create(info);

        info.setId("wuxi");
        info.setName("Wu Xi");
        info.setStayTime(3);
        service.create(info);

        info.setId("suzhou");
        info.setName("Su Zhou");
        info.setStayTime(3);
        service.create(info);

    }
}
