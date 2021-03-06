package com.kabasiji.generator.core.impl;

import com.kabasiji.generator.core.GeneratorService;
import com.kabasiji.generator.core.Param;
import com.kabasiji.generator.util.DatasourceUtils;

/**
 * @author huang_kangjie
 * @create 2018-09-04 10:57
 **/
public class GeneratorModelServiceImpl implements GeneratorService {

     @Override
     public void generator(Param param) {
          DatasourceUtils.getInstance().generatorModel(param);
          System.out.println("=======================model生成成功！============================");
     }

}
