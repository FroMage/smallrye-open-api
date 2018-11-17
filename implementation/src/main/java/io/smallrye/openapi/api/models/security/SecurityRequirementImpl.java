/**
 * Copyright 2017 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.smallrye.openapi.api.models.security;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.microprofile.openapi.models.security.SecurityRequirement;

import io.smallrye.openapi.api.models.ModelImpl;

/**
 * An implementation of the {@link SecurityRequirement} OpenAPI model interface.
 */
public class SecurityRequirementImpl extends LinkedHashMap<String, List<String>> implements SecurityRequirement, ModelImpl {

    private static final long serialVersionUID = -2336114397712664136L;

    /**
     * @see org.eclipse.microprofile.openapi.models.security.SecurityRequirement#addScheme(java.lang.String, java.lang.String)
     */
    @Override
    public SecurityRequirement addScheme(String securitySchemeName, String scope) {
        this.put(securitySchemeName, Collections.singletonList(scope));
        return this;
    }

    /**
     * @see org.eclipse.microprofile.openapi.models.security.SecurityRequirement#addScheme(java.lang.String, java.util.List)
     */
    @Override
    public SecurityRequirement addScheme(String securitySchemeName, List<String> scopes) {
        this.put(securitySchemeName, scopes);
        return this;
    }

    /**
     * @see org.eclipse.microprofile.openapi.models.security.SecurityRequirement#addScheme(java.lang.String)
     */
    @Override
    public SecurityRequirement addScheme(String securitySchemeName) {
        this.put(securitySchemeName, Collections.emptyList());
        return this;
    }

    /**
     * @see org.eclipse.microprofile.openapi.models.security.SecurityRequirement#removeScheme(String)
     */
    @Override
    public void removeScheme(String securitySchemeName) {
        this.remove(securitySchemeName);
    }

    /**
     * @see org.eclipse.microprofile.openapi.models.security.SecurityRequirement#getSchemes()
     */
    @Override
    public Map<String, List<String>> getSchemes() {
        return this;
    }

    /**
     * @see org.eclipse.microprofile.openapi.models.security.SecurityRequirement#setSchemes(java.util.Map)
     */
    @Override
    public void setSchemes(Map<String, List<String>> items) {
        this.clear();
        this.putAll(items);
    }

}