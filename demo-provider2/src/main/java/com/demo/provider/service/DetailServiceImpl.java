/*
 *  Copyright 2019 JDSchool Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.demo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.DetailService;
import com.demo.Info;
import com.demo.Result;
import com.demo.provider.mapper.DmDetailMapper;
import com.demo.provider.pojo.po.DmDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Title: DetailServiceImpl
 * Description: TODO(这里用一句话描述这个类的作用)
 *
 * @author yuhong
 * @Company com.jdschool
 * @date 2019/2/1 22:51
 */
@Service
@Component
public class DetailServiceImpl implements DetailService {

    private final DmDetailMapper detailMapper;

    @Autowired
    public DetailServiceImpl(DmDetailMapper detailMapper) {
        this.detailMapper = detailMapper;
    }

    @Override
    public Result addDetail(Info info) throws Exception {
        DmDetail detail = new DmDetail();
        detail.setDmDetailName(info.getDetailName());
        detail.setDmDetailGender(info.getDetailGender());
        this.detailMapper.insert(detail);
        int a = 1 / 0;
        return Result.ok();
    }
}
