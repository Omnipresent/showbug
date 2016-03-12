package com.aerstone

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class EnclaveController {

    static responseFormats = ['json']
//    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    @Secured(['ROLE_USER'])
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Enclave.list(params), model:[enclaveCount: Enclave.count()]
    }

    def show(Enclave enclave) {
        respond enclave
    }

    @Secured(['ROLE_USER'])
    @Transactional
    def save(Enclave enclave) {
        println "in save"
        println request.JSON
        if (enclave == null) {
            transactionStatus.setRollbackOnly()
            render status: NOT_FOUND
            return
        }

        if (enclave.hasErrors()) {
            println "had errors"
            transactionStatus.setRollbackOnly()
            respond enclave.errors, view:'create'
            return
        }

        enclave.save flush:true

        respond enclave, [status: CREATED, view:"show"]
    }

    @Secured(['ROLE_USER'])
    @Transactional
    def update(Enclave enclave) {
        if (enclave == null) {
            transactionStatus.setRollbackOnly()
            render status: NOT_FOUND
            return
        }

        if (enclave.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond enclave.errors, view:'edit'
            return
        }

        enclave.save flush:true

        respond enclave, [status: OK, view:"show"]
    }

    @Secured(['ROLE_USER'])
    @Transactional
    def delete(Enclave enclave) {

        if (enclave == null) {
            transactionStatus.setRollbackOnly()
            render status: NOT_FOUND
            return
        }

        enclave.delete flush:true

        render status: NO_CONTENT
    }
}
