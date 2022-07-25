package com.lucky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LuckyService {
  @Autowired
  private LuckyRepository luckyRepository;
  
  public Lucky findLastestLuckyResult() {
    return this.luckyRepository.findLastestLuckyResult();
  }
}