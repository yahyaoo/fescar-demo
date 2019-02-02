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

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fescar.spring.annotation.GlobalTransactional;
import com.demo.DetailService;
import com.demo.Info;
import com.demo.Result;
import com.demo.UserService;
import com.demo.provider.mapper.DmUserMapper;
import com.demo.provider.pojo.po.DmUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Title: UserServiceImpl
 * Description: TODO(这里用一句话描述这个类的作用)
 *
 * @author yuhong
 * @Company com.jdschool
 * @date 2019/2/1 17:32
 */
@Component
@Service
public class UserServiceImpl implements UserService {

    private final DmUserMapper userMapper;

    @Reference(timeout = 30000, check = false)
    private DetailService detailService;

    @Autowired
    public UserServiceImpl(DmUserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    @GlobalTransactional
    public Result addUser(Info info) throws Exception {
        DmUser user = new DmUser();
        user.setDmUserPassword(info.getUserPassword());
        this.userMapper.insert(user);
        this.detailService.addDetail(info);
        return Result.ok();
    }

}
