package com.bigdatamatrix;

import akka.actor.AbstractActor;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class SpringProps{

    public static Props create(ActorSystem actorSystem, String actorBeanName){

    }

    public static Props create(ActorSystem actorSystem, Class<? extends AbstractActor> requiredType){
        return SpringExtension.instance().get(actorSystem).create(requiredType)
    }

}
