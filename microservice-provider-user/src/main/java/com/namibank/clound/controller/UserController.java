package com.namibank.clound.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.namibank.clound.entity.User;
import com.namibank.clound.repository.UserRepository;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class UserController {

  @Autowired
  private UserRepository userRepository;
  
  @Autowired
  private EurekaClient eurekaClient;

  @Autowired
  private DiscoveryClient discoveryClient;

  @GetMapping("/simple/{id}")
  public User findById(@PathVariable Long id) {
    return this.userRepository.findOne(id);
  }
  
  //返回http://192.168.10.106:7900/
  @GetMapping("/eureka-instance")
  public String serviceUrl() {
    InstanceInfo instance = this.eurekaClient.getNextServerFromEureka("MICROSERVICE-PROVIDER-USER", false);
    return instance.getHomePageUrl();
  }

  /**
   * 返回{"host":"192.168.10.106","port":7900,"metadata":{},"uri":"http://192.168.10.106:7900",
   * 		"secure":false,"serviceId":"microservice-provider-user"}
   * @return
   */
  @GetMapping("/instance-info")
  public ServiceInstance showInfo() {
    ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
    return localServiceInstance;
  }
}
