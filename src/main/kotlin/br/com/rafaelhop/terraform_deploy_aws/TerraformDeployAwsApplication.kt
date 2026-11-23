package br.com.rafaelhop.terraform_deploy_aws

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TerraformDeployAwsApplication

fun main(args: Array<String>) {
	runApplication<TerraformDeployAwsApplication>(*args)
}
